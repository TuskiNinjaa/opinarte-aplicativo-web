package br.opinarte.backend.request;

import java.util.Date;

import lombok.Data;

@Data
public class UserPutRequestBody {

	private Long id;

	private String name;

	private String email;

	private String password;

	private Date createdDate;
}
