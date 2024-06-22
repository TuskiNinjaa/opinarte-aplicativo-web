package br.opinarte.backend.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class BookPostRequestBody {
    @NotEmpty(message = "The title cannot be empty")
    private String title;

    @NotEmpty(message = "The author cannot be empty")
	private String author;
}
