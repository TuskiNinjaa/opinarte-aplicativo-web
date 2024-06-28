package br.opinarte.backend.controller;

import java.util.Collections;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.opinarte.backend.entity.User;
import br.opinarte.backend.request.UserPostRequestBody;
import br.opinarte.backend.request.UserPutRequestBody;
import br.opinarte.backend.service.UserService;
import br.opinarte.backend.util.TestConstant;
import br.opinarte.backend.util.UserCreator;
import br.opinarte.backend.util.UserPostRequestBodyCreator;
import br.opinarte.backend.util.UserPutRequestBodyCreator;

@ExtendWith(SpringExtension.class)
public class UserControllerTest {
	@InjectMocks
	private UserController userController;

	@Mock
	private UserService userService;

	@BeforeEach
	void setUp() {
		PageImpl<User> userPage = new PageImpl<>(List.of(UserCreator.createUserValid()));

		BDDMockito.when(userService.listAllPageable(ArgumentMatchers.any()))
				.thenReturn(userPage);

		BDDMockito.when(userService.listAll())
				.thenReturn(List.of(UserCreator.createUserValid()));

		BDDMockito.when(userService.findById(ArgumentMatchers.anyLong()))
				.thenReturn(UserCreator.createUserValid());

		BDDMockito.when(userService.findByName(ArgumentMatchers.anyString()))
				.thenReturn(List.of(UserCreator.createUserValid()));

		BDDMockito.when(userService.save(ArgumentMatchers.any(UserPostRequestBody.class)))
				.thenReturn(UserCreator.createUserValid());

		BDDMockito.doNothing()
				.when(userService)
				.replace(ArgumentMatchers.any(UserPutRequestBody.class));

		BDDMockito.doNothing()
				.when(userService)
				.delete(ArgumentMatchers.anyLong());
	}

	@SuppressWarnings("null")
	@Test
	@DisplayName("listPageable method returns list of user inside page object when successful")
	void listPageable_ReturnListOfUserInsidePageObject_WhenSuccessful() {
		String expectedName = UserCreator.createUserValid().getName();
		Page<User> userPage = userController.listPageable(null).getBody();

		Assertions.assertThat(userPage).isNotNull();
		Assertions.assertThat(userPage.toList())
				.isNotEmpty()
				.hasSize(1);
		Assertions.assertThat(userPage.toList().get(0).getName()).isEqualTo(expectedName);
	}

	@SuppressWarnings("null")
	@Test
	@DisplayName("list method returns list of user when successful")
	void list_ReturnListOfUserInside_WhenSuccessful() {
		String expectedName = UserCreator.createUserValid().getName();
		List<User> list = userController.list().getBody();

		Assertions.assertThat(list).isNotNull();
		Assertions.assertThat(list)
				.isNotNull()
				.isNotEmpty()
				.hasSize(1);
		Assertions.assertThat(list.get(0).getName()).isEqualTo(expectedName);
	}

	@SuppressWarnings("null")
	@Test
	@DisplayName("findById method returns valid user when successful")
	void findById_ReturnUserValid_WhenSuccessful() {
		User user = userController.findById(TestConstant.ID).getBody();

		Assertions.assertThat(user).isNotNull();
		Assertions.assertThat(user.getId())
				.isNotNull()
				.isEqualTo(TestConstant.ID);
	}

	@SuppressWarnings("null")
	@Test
	@DisplayName("findByName method returns list of user when successful")
	void findByName_ReturnListOfUser_WhenSuccessful() {
		String expectedName = UserCreator.createUserValid().getName();
		List<User> list = userController.findByName(expectedName).getBody();

		Assertions.assertThat(list).isNotNull();
		Assertions.assertThat(list)
				.isNotNull()
				.isNotEmpty()
				.hasSize(1);
		Assertions.assertThat(list.get(0).getName()).isEqualTo(expectedName);
	}

	@Test
	@DisplayName("findByName method returns list of user when name is not found")
	void findByName_ReturnListOfUser_WhenNameIsNotFound() {
		BDDMockito.when(userService.findByName(ArgumentMatchers.anyString()))
				.thenReturn(Collections.emptyList());

		String name = UserCreator.createUserValid().getName();
		List<User> list = userController.findByName(name).getBody();

		Assertions.assertThat(list).isNotNull();
		Assertions.assertThat(list)
				.isNotNull()
				.isEmpty();
	}

	@SuppressWarnings("null")
	@Test
	@DisplayName("save method returns valid user when successful")
	void save_ReturnUserValid_WhenSuccessful() {
		User user = userController.save(UserPostRequestBodyCreator.create()).getBody();

		Assertions.assertThat(user.getId())
				.isNotNull()
				.isEqualTo(TestConstant.ID);
	}

	@Test
	@DisplayName("replace method updates user when successful")
	void replace_UpdatesUser_WhenSuccessful() {
		Assertions.assertThatCode(() -> userController.replace(UserPutRequestBodyCreator.create()).getBody())
				.doesNotThrowAnyException();
	}

	@Test
	@DisplayName("delete method deletes user when successful")
	void delete_DeletesUser_WhenSuccessful() {
		Assertions.assertThatCode(() -> userController.delete(1L))
				.doesNotThrowAnyException();
	}
}
