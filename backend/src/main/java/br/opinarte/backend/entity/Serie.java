package br.opinarte.backend.entity;

import java.util.Date;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;
import jakarta.persistence.GenerationType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "serie")
public class Serie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

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
