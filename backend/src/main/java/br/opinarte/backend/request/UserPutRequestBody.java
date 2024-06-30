package br.opinarte.backend.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserPutRequestBody {
	private Long id;
	private String name;
	private String email;
	private String password;
}
