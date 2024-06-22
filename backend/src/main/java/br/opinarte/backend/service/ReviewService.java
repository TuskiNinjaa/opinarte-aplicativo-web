package br.opinarte.backend.service;

import java.time.LocalDateTime;
import java.util.List;

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

    @Transactional
    public Review save(ReviewPostRequestBody reviewPostRequestBody) {
        Review review = ReviewMapper.INSTANCE.toReview(reviewPostRequestBody);
        review.setReviewDate(LocalDateTime.now());
        return reviewRepository.save(review);
    }

    public List<Review> findByMediaTypeAndMediaId(String mediaType, Long mediaId) {
        return reviewRepository.findByMediaTypeAndMediaId(mediaType, mediaId);
    }

    public void delete(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }

    @Transactional
    public Review replace(ReviewPutRequestBody reviewPutRequestBody) {
        Review existingReview = reviewRepository.findById(reviewPutRequestBody.getReviewId())
                .orElseThrow(() -> new BadRequestException("Review not found"));
        
        Review updatedReview = ReviewMapper.INSTANCE.toReview(reviewPutRequestBody);
        updatedReview.setReviewId(existingReview.getReviewId());
        updatedReview.setReviewDate(existingReview.getReviewDate());  // Keep the original review date

        return reviewRepository.save(updatedReview);
    }
}
