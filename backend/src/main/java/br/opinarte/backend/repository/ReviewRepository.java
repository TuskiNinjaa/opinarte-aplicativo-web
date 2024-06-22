package br.opinarte.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.opinarte.backend.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByMediaTypeAndMediaId(String mediaType, Long mediaId);
}
