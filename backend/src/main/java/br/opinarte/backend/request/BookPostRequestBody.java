package br.opinarte.backend.request;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

@Data
public class BookPostRequestBody {
	@NotEmpty(message = "The name cannot be empty")
	private String name;

	@NotEmpty(message = "The author cannot be empty")
	private String author;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent
	private Date releaseDate;

	@NotEmpty(message = "The Genre cannot be empty")
	private String genre;

	@NotEmpty(message = "The Description cannot be empty")
	private String description;
}
