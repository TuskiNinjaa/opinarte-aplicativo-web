package br.opinarte.backend.controller;

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

import br.opinarte.backend.entity.Movie;
import br.opinarte.backend.request.MoviePostRequestBody;
import br.opinarte.backend.request.MoviePutRequestBody;
import br.opinarte.backend.service.MovieService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "movie")
@RequiredArgsConstructor
public class MovieController {
	private final MovieService movieService;

	@GetMapping(path = "list")
	public ResponseEntity<List<Movie>> list() {
		return ResponseEntity.ok(movieService.listAll());
	}

	@GetMapping
	public ResponseEntity<Page<Movie>> listPageable(Pageable pageable) {
		return ResponseEntity.ok(movieService.listAll(pageable));
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Movie> findById(@PathVariable Long id) {
		return ResponseEntity.ok(movieService.findById(id));
	}

	@GetMapping(path = "/find-by-name")
	public ResponseEntity<List<Movie>> findByName(@RequestParam(required = false) String name) {
		return ResponseEntity.ok(movieService.findByName(name));
	}

	@PostMapping
	public ResponseEntity<Movie> save(@RequestBody @Valid MoviePostRequestBody moviePostRequestBody) {
		return new ResponseEntity<>(movieService.save(moviePostRequestBody), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		movieService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PutMapping
	public ResponseEntity<Void> replace(@RequestBody @Valid MoviePutRequestBody moviePutRequestBody) {
		movieService.replace(moviePutRequestBody);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
