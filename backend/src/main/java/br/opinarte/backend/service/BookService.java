package br.opinarte.backend.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.opinarte.backend.entity.Book;
import br.opinarte.backend.exception.BadRequestException;
import br.opinarte.backend.mapper.BookMapper;
import br.opinarte.backend.repository.BookRepository;
import br.opinarte.backend.request.BookPostRequestBody;
import br.opinarte.backend.request.BookPutRequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public Book save(@Valid BookPostRequestBody bookPostRequestBody) {
        return bookRepository.save(BookMapper.INSTANCE.toBook(bookPostRequestBody));
    }

    public List<Book> listAll() {
        return bookRepository.findAll();
    }

    public Page<Book> listAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    public Book findById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Book not found"));
    }

    public List<Book> findByName(String name) {
		return bookRepository.findByName(name);
	}

    public void delete(Long id) {
        bookRepository.delete(this.findById(id));
    }

    public void replace(@Valid BookPutRequestBody bookPutRequestBody) {
        Book bookFound = this.findById(bookPutRequestBody.getId());
        Book book = BookMapper.INSTANCE.toBook(bookPutRequestBody);
        book.setId(bookFound.getId());
        bookRepository.save(book);
    }
}
