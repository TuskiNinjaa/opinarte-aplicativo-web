package br.opinarte.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.opinarte.backend.entity.Serie;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {
	List<Serie> findByName(String name);
}
