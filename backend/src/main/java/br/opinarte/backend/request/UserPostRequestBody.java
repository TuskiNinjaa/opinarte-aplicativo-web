package br.opinarte.backend.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserPostRequestBody {
	@NotEmpty(message = "The name cannot be empty")
	private String name;

	@NotEmpty(message = "The email cannot be empty")
	@Email(message = "The email should be well-formed")
	private String email;

	@NotEmpty(message = "The passowrd cannot be empty")
	private String password;
}
