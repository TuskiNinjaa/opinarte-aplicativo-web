package br.opinarte.backend.repository;

import java.util.Date;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.opinarte.backend.entity.Book;

@DataJpaTest
@DisplayName("Tests for BookRepository")
public class BookRepositoryTest {
	@Autowired
	private BookRepository bookRepository;

	@Test
	void save_PersistBook_WhenSuccessful() {
		Book sampleToBeSaved = createSample();
		Book sampleSaved = this.bookRepository.save(sampleToBeSaved);

		Assertions.assertThat(sampleSaved).isNotNull();
		Assertions.assertThat(sampleSaved.getId()).isNotNull();
		Assertions.assertThat(sampleSaved.getName()).isEqualTo(sampleToBeSaved.getName());
		Assertions.assertThat(sampleSaved.getReleaseDate()).isEqualTo(sampleToBeSaved.getReleaseDate());
		Assertions.assertThat(sampleSaved.getGenre()).isEqualTo(sampleToBeSaved.getGenre());
		Assertions.assertThat(sampleSaved.getDescription()).isEqualTo(sampleToBeSaved.getDescription());
	}

	private Book createSample() {
		return Book.builder()
				.name("Sample name")
				.author("Sample author")
				.releaseDate(new Date())
				.genre("Terror")
				.description("Film description")
				.build();
	}
}