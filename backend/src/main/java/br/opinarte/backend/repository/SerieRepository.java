package br.opinarte.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.opinarte.backend.entity.Serie;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    List<Serie> findByName(String name);
}
