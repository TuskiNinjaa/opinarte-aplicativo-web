package br.opinarte.backend.entity;

import java.time.LocalDateTime;
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
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @NotNull(message = "The user ID cannot be null")
    private Long userId;

    @NotNull(message = "The media type cannot be null")
    @Pattern(regexp = "movie|series|book", message = "The media type must be 'movie', 'series', or 'book'")
    private String mediaType;

    @NotNull(message = "The media ID cannot be null")
    private Long mediaId;

    @Min(value = 1, message = "The rating must be at least 1")
    @Max(value = 10, message = "The rating must be at most 10")
    private Integer rating;

    private String reviewText;

    private LocalDateTime reviewDate;
}
