package br.opinarte.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.opinarte.backend.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByName(String name);
}
