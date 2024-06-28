package br.opinarte.backend.util;

import br.opinarte.backend.entity.User;

public class UserCreator {
	public static User createUserToBeSaved() {
		return User.builder()
				.name(TestConstant.NAME)
				.email(TestConstant.EMAIL)
				.password(TestConstant.PASSWORD)
				.build();
	}

	public static User createUserValid() {
		return User.builder()
				.id(TestConstant.ID)
				.name(TestConstant.NAME)
				.email(TestConstant.EMAIL)
				.password(TestConstant.PASSWORD)
				.build();
	}

	public static User createUserUpdated(User user) {
		return User.builder()
				.id(TestConstant.ID)
				.name(TestConstant.NAME_UPDATED)
				.email(TestConstant.EMAIL_UPDATED)
				.password(TestConstant.PASSWORD_UPDATED)
				.createdDate(user.getCreatedDate())
				.build();
	}
}
