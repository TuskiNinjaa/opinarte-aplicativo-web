package br.opinarte.backend.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "review")
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "The user ID cannot be null")
	@Positive(message = "The user ID must be positive")
	private Long userId;

	@NotNull(message = "The media ID cannot be null")
	@Positive(message = "The media ID must be positive")
	private Long mediaId;

	@NotNull(message = "The media type cannot be null")
	@Pattern(regexp = "movie|series|book", message = "The media type must be 'movie', 'series', or 'book'")
	private String mediaType;

	@Min(value = 1, message = "The rating must be at least 1")
	@Max(value = 10, message = "The rating must be at most 10")
	private Integer rating;

	@NotEmpty(message = "The title cannot be empty")
	private String title;

	@NotEmpty(message = "The review text cannot be empty")
	private String reviewText;

	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdDate;
}
