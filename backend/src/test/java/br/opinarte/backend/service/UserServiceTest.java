package br.opinarte.backend.service;

import static org.mockito.Mockito.mock;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

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
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.opinarte.backend.entity.User;
import br.opinarte.backend.exception.BadRequestException;
import br.opinarte.backend.repository.UserRepository;
import br.opinarte.backend.request.UserPutRequestBody;
import br.opinarte.backend.util.TestConstant;
import br.opinarte.backend.util.UserCreator;
import br.opinarte.backend.util.UserPostRequestBodyCreator;

@ExtendWith(SpringExtension.class)
public class UserServiceTest {
	@InjectMocks
	private UserService userService;

	@Mock
	private UserRepository userRepository;

	@BeforeEach
	public void setUp() {
		User user = mock(User.class);
		Optional<User> optUser = Optional.of(user);
		PageImpl<User> userPage = new PageImpl<>(List.of(UserCreator.createUserValid()));
		BDDMockito.when(userRepository.findAll(ArgumentMatchers.any(PageRequest.class)))
				.thenReturn(userPage);

		BDDMockito.when(userRepository.findAll())
				.thenReturn(List.of(UserCreator.createUserValid()));

		BDDMockito.when(userRepository.findById(ArgumentMatchers.anyLong()))
				.thenReturn(optUser);

		BDDMockito.when(userRepository.findByName(ArgumentMatchers.anyString()))
				.thenReturn(List.of(UserCreator.createUserValid()));

		BDDMockito.when(userRepository.save(ArgumentMatchers.any(User.class)))
				.thenReturn(UserCreator.createUserValid());

		BDDMockito.doNothing()
				.when(userRepository)
				.delete(ArgumentMatchers.any(User.class));
	}

	@Test
	@DisplayName("listPageable method returns list of user inside page object when successful")
	void listPageable_ReturnListOfUserInsidePageObject_WhenSuccessful() {
		String expectedName = UserCreator.createUserValid().getName();
		Page<User> userPage = userService.listAllPageable(PageRequest.of(1, 1));

		Assertions.assertThat(userPage).isNotNull();
		Assertions.assertThat(userPage.toList())
				.isNotEmpty()
				.hasSize(1);
		Assertions.assertThat(userPage.toList().get(0).getName()).isEqualTo(expectedName);
	}

	@Test
	@DisplayName("list method returns list of user when successful")
	void list_ReturnListOfUserInside_WhenSuccessful() {
		String expectedName = UserCreator.createUserValid().getName();
		List<User> list = userService.listAll();

		Assertions.assertThat(list).isNotNull();
		Assertions.assertThat(list)
				.isNotNull()
				.isNotEmpty()
				.hasSize(1);
		Assertions.assertThat(list.get(0).getName()).isEqualTo(expectedName);
	}

	@Test
	@DisplayName("findById method returns valid user when successful")
	void findById_ReturnUserValid_WhenSuccessful() {
		User user = userService.findById(TestConstant.ID);

		Assertions.assertThat(user).isNotNull();
		Assertions.assertThat(user.getId())
				.isNotNull();
	}

	@Test
	@DisplayName("findById method returns BadRequestException when successful")
	void findById_ReturnBadRequestException_WhenSuccessful() {

		BDDMockito.when(userRepository.findById(ArgumentMatchers.anyLong()))
				.thenReturn(Optional.empty());

		Assertions.assertThatExceptionOfType(BadRequestException.class)
				.isThrownBy(() -> userService.findById(TestConstant.ID));
	}

	@Test
	@DisplayName("findByName method returns list of user when successful")
	void findByName_ReturnListOfUser_WhenSuccessful() {
		String expectedName = UserCreator.createUserValid().getName();
		List<User> list = userService.findByName(expectedName);

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
		BDDMockito.when(userRepository.findByName(ArgumentMatchers.anyString()))
				.thenReturn(Collections.emptyList());

		String name = UserCreator.createUserValid().getName();
		List<User> list = userService.findByName(name);

		Assertions.assertThat(list).isNotNull();
		Assertions.assertThat(list)
				.isNotNull()
				.isEmpty();
	}

	@Test
	@DisplayName("save method returns valid user when successful")
	void save_ReturnUserValid_WhenSuccessful() {
		User user = userService.save(UserPostRequestBodyCreator.create());

		Assertions.assertThat(user.getId())
				.isNotNull()
				.isEqualTo(TestConstant.ID);
	}

	@Test
	@DisplayName("replace method updates user when successful")
	void replace_UpdatesUser_WhenSuccessful() {
		UserPutRequestBody userPutRequestBody = mock(UserPutRequestBody.class);
		Assertions.assertThatCode(() -> userService.replace(userPutRequestBody))
				.doesNotThrowAnyException();
	}

	@Test
	@DisplayName("delete method deletes user when successful")
	void delete_DeletesUser_WhenSuccessful() {
		Assertions.assertThatCode(() -> userService.delete(TestConstant.ID))
				.doesNotThrowAnyException();
	}
}
