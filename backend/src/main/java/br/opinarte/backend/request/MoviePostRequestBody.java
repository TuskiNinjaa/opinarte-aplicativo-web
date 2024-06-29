package br.opinarte.backend.request;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

@Data
public class MoviePostRequestBody {
	@NotEmpty(message = "The name cannot be empty")
	private String name;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent
	private Date releaseDate;

	@NotEmpty(message = "The genre cannot be empty")
	private String genre;

	@NotEmpty(message = "The director cannot be empty")
	private String director;

	@NotEmpty(message = "The description cannot be empty")
	private String description;
}
