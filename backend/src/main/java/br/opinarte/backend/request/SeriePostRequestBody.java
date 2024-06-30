package br.opinarte.backend.request;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class SeriePostRequestBody {
	@NotEmpty(message = "The title cannot be empty")
	private String name;

	@PositiveOrZero(message = "The season must be positive or zero")
	@NotNull(message = "The seasons cannot be null")
	private Integer seasons;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent
	@NotNull(message = "The date cannot be null")
	private Date releaseDate;

	@NotEmpty(message = "The genre cannot be empty")
	private String genre;

	@NotEmpty(message = "The director cannot be empty")
	private String director;

	@NotEmpty(message = "The description cannot be empty")
	private String description;
}
