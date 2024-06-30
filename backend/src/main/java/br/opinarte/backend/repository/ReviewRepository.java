package br.opinarte.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.opinarte.backend.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
	List<Review> findByMediaType(String mediaType);

	List<Review> findByMediaTypeAndMediaId(String mediaType, Long mediaId);

	List<Review> findByUserId(Long userId);
}
