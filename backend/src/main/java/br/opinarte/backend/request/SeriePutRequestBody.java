package br.opinarte.backend.request;

import java.util.Date;
import lombok.Data;

@Data
public class SeriePutRequestBody {
    private Long id;

    private String title;
    private Date release_date;
    private String genre;
    private String director;
    private Integer seasons;
    private String description;
}
