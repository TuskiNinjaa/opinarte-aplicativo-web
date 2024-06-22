package br.opinarte.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.opinarte.backend.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByName(String name);
}
