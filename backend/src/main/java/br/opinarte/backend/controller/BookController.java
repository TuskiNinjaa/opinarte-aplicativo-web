package br.opinarte.backend.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.opinarte.backend.entity.Book;
import br.opinarte.backend.request.BookPostRequestBody;
import br.opinarte.backend.request.BookPutRequestBody;
import br.opinarte.backend.service.BookService;
import br.opinarte.backend.util.DateUtil;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping(path = "book")
@Log4j2
@RequiredArgsConstructor
public class BookController {
	private final BookService bookService;
	private final DateUtil dateUtil;

	@GetMapping(path = "list")
	public ResponseEntity<List<Book>> list() {
		return ResponseEntity.ok(bookService.listAll());
	}

	@GetMapping
	public ResponseEntity<Page<Book>> listPageable(Pageable pageable) {
		return ResponseEntity.ok(bookService.listAll(pageable));
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Book> findById(@PathVariable Long id) {
		return ResponseEntity.ok(bookService.findById(id));
	}

	@GetMapping(path = "/find-by-name")
	public ResponseEntity<List<Book>> findByName(@RequestParam(required = false) String name) {
		log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
		return ResponseEntity.ok(bookService.findByName(name));
	}

	@PostMapping
	public ResponseEntity<Book> save(@RequestBody @Valid BookPostRequestBody bookPostRequestBody) {
		log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
		return new ResponseEntity<>(bookService.save(bookPostRequestBody), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		bookService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PutMapping
	public ResponseEntity<Void> replace(@RequestBody @Valid BookPutRequestBody bookPutRequestBody) {
		bookService.replace(bookPutRequestBody);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
