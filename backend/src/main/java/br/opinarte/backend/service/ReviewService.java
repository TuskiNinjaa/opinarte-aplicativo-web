package br.opinarte.backend.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.opinarte.backend.entity.Review;
import br.opinarte.backend.exception.BadRequestException;
import br.opinarte.backend.mapper.ReviewMapper;
import br.opinarte.backend.repository.ReviewRepository;
import br.opinarte.backend.request.ReviewPostRequestBody;
import br.opinarte.backend.request.ReviewPutRequestBody;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReviewService {
	private final ReviewRepository reviewRepository;

	public List<Review> listAll() {
		return reviewRepository.findAll();
	}

	public Page<Review> listAllPageable(Pageable pageable) {
		return reviewRepository.findAll(pageable);
	}

	public Review findById(Long id) {
		return reviewRepository.findById(id)
				.orElseThrow(() -> new BadRequestException("Serie not found"));
	}

	public List<Review> findByMediaType(String mediaType) {
		return reviewRepository.findByMediaType(mediaType);
	}

	public List<Review> findByMediaTypeAndMediaId(String mediaType, Long mediaId) {
		return reviewRepository.findByMediaTypeAndMediaId(mediaType, mediaId);
	}

	public List<Review> findByUserId(Long userId) {
		return reviewRepository.findByUserId(userId);
	}

	@Transactional
	public Review save(ReviewPostRequestBody reviewPostRequestBody) {
		Review review = ReviewMapper.INSTANCE.toReview(reviewPostRequestBody);
		return reviewRepository.save(review);
	}

	public void delete(Long reviewId) {
		reviewRepository.deleteById(reviewId);
	}

	@Transactional
	public Review replace(ReviewPutRequestBody reviewPutRequestBody) {
		Review reviewFound = this.findById(reviewPutRequestBody.getId());
		Review reviewUpdated = ReviewMapper.INSTANCE.toReview(reviewPutRequestBody);
		reviewUpdated.setId(reviewFound.getId());
		reviewUpdated.setCreatedDate(reviewFound.getCreatedDate());

		return reviewRepository.save(reviewUpdated);
	}
}
