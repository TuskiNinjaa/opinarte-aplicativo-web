package br.opinarte.backend.request;

import java.util.Date;
import lombok.Data;

@Data
public class BookPutRequestBody {
	private Long id;
	private String name;
	private Date releaseDate;
	private String genre;
	private String author;
	private String description;
}
