package br.opinarte.backend.request;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserPutRequestBody {

	private Long id;

	private String name;

	private String email;

	private String password;

	private Date createdDate;
}
