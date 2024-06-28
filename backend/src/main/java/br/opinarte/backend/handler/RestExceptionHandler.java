package br.opinarte.backend.handler;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.opinarte.backend.exception.BadRequestException;
import br.opinarte.backend.exception.BadRequestExceptionDetails;
import br.opinarte.backend.exception.ExceptionDetails;
import br.opinarte.backend.exception.ValidationExceptionDetails;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<BadRequestExceptionDetails> handleBadRequestException(
			BadRequestException badRequestException) {
		return new ResponseEntity<>(
				BadRequestExceptionDetails.builder()
						.timestamp(LocalDateTime.now())
						.status(HttpStatus.BAD_REQUEST.value())
						.titleString("Bad Request Exception, Check the Documentation.")
						.details(badRequestException.getMessage())
						.developerMessage(badRequestException.getClass().getName())
						.build(),
				HttpStatus.BAD_REQUEST);
	}

	@SuppressWarnings("null")
	@Override
	@Nullable
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		List<FieldError> fieldError = ex.getBindingResult().getFieldErrors();
		String field = fieldError.stream().map(FieldError::getField).collect(Collectors.joining(", "));
		String fieldsMessage = fieldError.stream().map(FieldError::getDefaultMessage).collect(Collectors.joining(", "));

		return new ResponseEntity<>(
				ValidationExceptionDetails.builder()
						.timestamp(LocalDateTime.now())
						.status(HttpStatus.BAD_REQUEST.value())
						.titleString("Bad Request Exception, Invalid Fields.")
						.details("Check the field(s) error.")
						.developerMessage(ex.getClass().getName())
						.fields(field)
						.fieldsMessage(fieldsMessage)
						.build(),
				HttpStatus.BAD_REQUEST);
	}

	@SuppressWarnings("null")
	@Override
	@Nullable
	protected ResponseEntity<Object> handleExceptionInternal(
			Exception ex, @Nullable Object body, HttpHeaders headers, HttpStatusCode statusCode, WebRequest request) {

		ExceptionDetails exceptionDetails = ExceptionDetails.builder()
				.timestamp(LocalDateTime.now())
				.status(statusCode.value())
				.titleString(ex.getCause().getMessage())
				.details(ex.getMessage())
				.developerMessage(ex.getClass().getName())
				.build();

		return createResponseEntity(exceptionDetails, headers, statusCode, request);
	}
}
