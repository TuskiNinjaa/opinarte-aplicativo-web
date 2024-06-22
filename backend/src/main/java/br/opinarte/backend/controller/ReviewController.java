package br.opinarte.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.opinarte.backend.entity.Review;
import br.opinarte.backend.request.ReviewPostRequestBody;
import br.opinarte.backend.request.ReviewPutRequestBody;
import br.opinarte.backend.service.ReviewService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "reviews")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> save(@RequestBody @Valid ReviewPostRequestBody reviewPostRequestBody) {
        return new ResponseEntity<>(reviewService.save(reviewPostRequestBody), HttpStatus.CREATED);
    }

    @GetMapping(path = "/{mediaType}/{mediaId}")
    public ResponseEntity<List<Review>> findByMediaTypeAndMediaId(@PathVariable String mediaType, @PathVariable Long mediaId) {
        return ResponseEntity.ok(reviewService.findByMediaTypeAndMediaId(mediaType, mediaId));
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
