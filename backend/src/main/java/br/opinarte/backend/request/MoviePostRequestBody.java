package br.opinarte.backend.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class MoviePostRequestBody {
    @NotEmpty(message = "The title cannot be empty")
    private String title;
}