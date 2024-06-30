package br.opinarte.backend.request;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class ReviewPostRequestBody {
	@NotNull(message = "The user ID cannot be null")
	@Positive(message = "The user ID must be positive")
	private Long userId;

	@NotNull(message = "The media type cannot be null")
	@Pattern(regexp = "movie|series|book", message = "The media type must be 'movie', 'series', or 'book'")
	private String mediaType;

	@NotNull(message = "The media ID cannot be null")
	@Positive(message = "The media ID must be positive")
	private Long mediaId;

	@Min(value = 1, message = "The rating must be at least 1")
	@Max(value = 10, message = "The rating must be at most 10")
	private Integer rating;

	@NotEmpty(message = "The title cannot be empty")
	private String title;

	@NotEmpty(message = "The review text cannot be empty")
	private String reviewText;
}
