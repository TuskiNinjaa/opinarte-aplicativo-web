package br.opinarte.backend.request;

import java.util.Date;
import lombok.Data;

@Data
public class BookPutRequestBody {
    private Long id;

    private String title;
    private Date release_date;
    private String genre;
    private String author;
    private String description;
}
