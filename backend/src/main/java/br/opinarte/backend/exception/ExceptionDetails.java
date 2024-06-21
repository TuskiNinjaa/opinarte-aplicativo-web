package br.opinarte.backend.exception;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class ExceptionDetails {
	protected String titleString;
	protected Integer status;
	protected String details;
	protected String developerMessage;
	protected LocalDateTime timestamp;
}
