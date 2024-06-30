package br.opinarte.backend.request;

import lombok.Data;

@Data
public class ReviewPutRequestBody {
	private Long id;
	private Long userId;
	private Long mediaId;
	private String mediaType;
	private Integer rating;
	private String title;
	private String reviewText;
}
