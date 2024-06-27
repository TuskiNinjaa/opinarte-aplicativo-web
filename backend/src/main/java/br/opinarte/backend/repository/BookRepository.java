package br.opinarte.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.opinarte.backend.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByName(String name);
}
