package br.opinarte.backend.request;

import java.util.Date;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class SeriePostRequestBody {
	@NotEmpty(message = "The title cannot be empty")
	private String name;

	@NotEmpty(message = "The seasons cannot be empty")
	private Integer seasons;

	@NotEmpty(message = "The release date cannot be empty")
	private Date releaseDate;

	@NotEmpty(message = "The genre cannot be empty")
	private String genre;

	@NotEmpty(message = "The director cannot be empty")
	private String director;

	@NotEmpty(message = "The description cannot be empty")
	private String description;
}
