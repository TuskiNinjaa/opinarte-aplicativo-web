package br.opinarte.backend.request;

import java.util.Date;

import lombok.Data;

@Data
public class MoviePutRequestBody {
	private Long id;
	private String name;
	private Date releaseDate;
	private String genre;
	private String director;
	private String description;
}
