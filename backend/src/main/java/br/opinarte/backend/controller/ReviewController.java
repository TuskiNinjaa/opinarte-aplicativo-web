package br.opinarte.backend.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.opinarte.backend.entity.Review;
import br.opinarte.backend.entity.Review;
import br.opinarte.backend.request.ReviewPostRequestBody;
import br.opinarte.backend.request.ReviewPutRequestBody;
import br.opinarte.backend.service.ReviewService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "review")
@RequiredArgsConstructor
public class ReviewController {
	private final ReviewService reviewService;

	@GetMapping(path = "list")
	public ResponseEntity<List<Review>> list() {
		return ResponseEntity.ok(reviewService.listAll());
	}

	@GetMapping
	public ResponseEntity<Page<Review>> listPageable(Pageable pageable) {
		return ResponseEntity.ok(reviewService.listAllPageable(pageable));
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Review> findById(@PathVariable Long id) {
		return ResponseEntity.ok(reviewService.findById(id));
	}

	@GetMapping(path = "/find-by-media-type")
	public ResponseEntity<List<Review>> findByMediaType(@RequestParam(required = true) String mediaType) {
		return ResponseEntity.ok(reviewService.findByMediaType(mediaType));
	}

	@GetMapping(path = "/find-by-media-type-media-id")
	public ResponseEntity<List<Review>> findByMediaTypeAndMediaId(@RequestParam(required = true) String mediaType,
			@RequestParam(required = true) Long mediaId) {
		return ResponseEntity.ok(reviewService.findByMediaTypeAndMediaId(mediaType, mediaId));
	}

	@GetMapping(path = "/find-by-user-id")
	public ResponseEntity<List<Review>> findByUserId(@RequestParam(required = true) Long userId) {
		return ResponseEntity.ok(reviewService.findByUserId(userId));
	}

	@PostMapping
	public ResponseEntity<Review> save(@RequestBody @Valid ReviewPostRequestBody reviewPostRequestBody) {
		return new ResponseEntity<>(reviewService.save(reviewPostRequestBody), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/{reviewId}")
	public ResponseEntity<Void> delete(@PathVariable Long reviewId) {
		reviewService.delete(reviewId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PutMapping
	public ResponseEntity<Review> replace(@RequestBody @Valid ReviewPutRequestBody reviewPutRequestBody) {
		return new ResponseEntity<>(reviewService.replace(reviewPutRequestBody), HttpStatus.OK);
	}
}
