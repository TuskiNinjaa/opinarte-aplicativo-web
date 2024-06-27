package br.opinarte.backend.request;

import java.util.Date;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class MoviePostRequestBody {
	@NotEmpty(message = "The name cannot be empty")
	private String name;

	@NotEmpty(message = "The release date cannot be empty")
	private Date releaseDate;

	@NotEmpty(message = "The genre cannot be empty")
	private String genre;

	@NotEmpty(message = "The director cannot be empty")
	private String director;

	@NotEmpty(message = "The description cannot be empty")
	private String description;
}
