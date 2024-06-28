package br.opinarte.backend.repository;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.opinarte.backend.entity.User;
import br.opinarte.backend.util.UserCreator;
import jakarta.validation.ConstraintViolationException;

@DataJpaTest
@DisplayName("Tests for UserRepository")
public class UserRepositoryTest {
	@Autowired
	private UserRepository userRepository;

	@Test
	@DisplayName("Save updates user when succssesful")
	void save_PersistUser_WhenSuccessful() {
		User userToBeSaved = UserCreator.createUserToBeSaved();
		User userSaved = this.userRepository.save(userToBeSaved);

		Assertions.assertThat(userSaved).isNotNull();
		Assertions.assertThat(userSaved.getId()).isNotNull();
		Assertions.assertThat(userSaved.getName()).isEqualTo(userToBeSaved.getName());
		Assertions.assertThat(userSaved.getPassword()).isEqualTo(userToBeSaved.getPassword());
		Assertions.assertThat(userSaved.getCreatedDate()).isEqualTo(userToBeSaved.getCreatedDate());
	}

	@Test
	@DisplayName("Save deletes user when succssesful")
	void save_DeletesUser_WhenSuccessful() {
		User userToBeSaved = UserCreator.createUserToBeSaved();
		User userSaved = this.userRepository.save(userToBeSaved);

		this.userRepository.delete(userSaved);

		Optional<User> animeOptional = this.userRepository.findById(userSaved.getId());

		Assertions.assertThat(animeOptional).isEmpty();
	}

	@Test
	@DisplayName("Save updates user when succssesful")
	void save_ReplaceUser_WhenSuccessful() {
		User userToBeSaved = UserCreator.createUserToBeSaved();
		User userSaved = this.userRepository.save(userToBeSaved);
		User userUpdate = UserCreator.createUserUpdated(userSaved);
		User userUpdated = this.userRepository.save(userUpdate);

		Assertions.assertThat(userUpdate).isNotNull();
		Assertions.assertThat(userUpdate.getId()).isNotNull();
		Assertions.assertThat(userUpdate.getName()).isEqualTo(userUpdated.getName());
		Assertions.assertThat(userUpdate.getPassword()).isEqualTo(userUpdated.getPassword());
		Assertions.assertThat(userUpdate.getCreatedDate()).isEqualTo(userUpdated.getCreatedDate());
	}

	@Test
	@DisplayName("Find By Name returns list of user when succssesful")
	void findByName_ReturnsListOfANime_WhenSuccessful() {
		User userToBeSaved = UserCreator.createUserToBeSaved();
		User userSaved = this.userRepository.save(userToBeSaved);

		String name = userSaved.getName();

		List<User> list = this.userRepository.findByName(name);

		Assertions.assertThat(list)
				.isNotEmpty()
				.contains(userSaved);
	}

	@Test
	@DisplayName("Find By Name returns empty list of user when no user is found")
	void findByName_ReturnsEmptyList_WhenAnimeIsNotFound() {
		List<User> user = this.userRepository.findByName("name");

		Assertions.assertThat(user).isEmpty();
	}

	@Test
	@DisplayName("Save throw ConstraintValidationException when name is empty")
	void save_ThrowsConstraintValidationException_WhenNameIsEmpty() {
		User user = UserCreator.createUserValid();
		user.setName(null);

		Assertions.assertThatExceptionOfType(ConstraintViolationException.class)
				.isThrownBy(() -> this.userRepository.save(user))
				.withMessageContaining("The name cannot be empty");
	}

	@Test
	@DisplayName("Save throw ConstraintValidationException when email is empty")
	void save_ThrowsConstraintValidationException_WhenEmailIsEmpty() {
		User user = UserCreator.createUserValid();
		user.setEmail(null);

		Assertions.assertThatExceptionOfType(ConstraintViolationException.class)
				.isThrownBy(() -> this.userRepository.save(user))
				.withMessageContaining("The email cannot be empty");
	}

	@Test
	@DisplayName("Save throw ConstraintValidationException when password is empty")
	void save_ThrowsConstraintValidationException_WhenPasswordIsEmpty() {
		User user = UserCreator.createUserValid();
		user.setPassword(null);

		Assertions.assertThatExceptionOfType(ConstraintViolationException.class)
				.isThrownBy(() -> this.userRepository.save(user))
				.withMessageContaining("The passowrd cannot be empty");
	}

	@Test
	@DisplayName("Save throw ConstraintValidationException when email ill-formed")
	void save_ThrowsConstraintValidationException_WhenEmailIsIllFormed() {
		User user = UserCreator.createUserValid();
		user.setEmail("Bad Email Name");

		Assertions.assertThatExceptionOfType(ConstraintViolationException.class)
				.isThrownBy(() -> this.userRepository.save(user))
				.withMessageContaining("The email should be well-formed");
	}
}
