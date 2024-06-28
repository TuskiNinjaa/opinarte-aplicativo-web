package br.opinarte.backend.util;

import br.opinarte.backend.request.UserPutRequestBody;

public class UserPutRequestBodyCreator {

	public static UserPutRequestBody create() {
		return UserPutRequestBody.builder()
				.name(TestConstant.NAME)
				.email(TestConstant.EMAIL)
				.password(TestConstant.PASSWORD)
				.build();
	}
}
