package br.opinarte.backend.request;

import java.util.Date;
import lombok.Data;

@Data
public class SeriePutRequestBody {
	private Long id;

	private String name;
	private Date releaseDate;
	private String genre;
	private String director;
	private Integer seasons;
	private String description;
}
