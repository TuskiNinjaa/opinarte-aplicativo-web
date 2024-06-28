package br.opinarte.backend.util;

import br.opinarte.backend.request.UserPostRequestBody;

public class UserPostRequestBodyCreator {

	public static UserPostRequestBody create() {
		return UserPostRequestBody.builder()
				.name(TestConstant.NAME)
				.email(TestConstant.EMAIL)
				.password(TestConstant.PASSWORD)
				.build();
	}
}
