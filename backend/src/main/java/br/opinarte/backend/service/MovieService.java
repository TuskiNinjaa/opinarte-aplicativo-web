package br.opinarte.backend.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.opinarte.backend.entity.Movie;
import br.opinarte.backend.exception.BadRequestException;
import br.opinarte.backend.mapper.MovieMapper;
import br.opinarte.backend.repository.MovieRepository;
import br.opinarte.backend.request.MoviePostRequestBody;
import br.opinarte.backend.request.MoviePutRequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    @Transactional
    public Movie save(@Valid MoviePostRequestBody moviePostRequestBody) {
        return movieRepository.save(MovieMapper.INSTANCE.toMovie(moviePostRequestBody));
    }

    public List<Movie> listAll() {
        return movieRepository.findAll();
    }

    public Page<Movie> listAll(Pageable pageable) {
        return movieRepository.findAll(pageable);
    }

    public Movie findById(Long id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Movie not found"));
    }

    public List<Movie> findByName(String name) {
		return movieRepository.findByName(name);
	}

    public void delete(Long id) {
        movieRepository.delete(this.findById(id));
    }

    public void replace(@Valid MoviePutRequestBody moviePutRequestBody) {
        Movie movieFound = this.findById(moviePutRequestBody.getId());
        Movie movie = MovieMapper.INSTANCE.toMovie(moviePutRequestBody);
        movie.setId(movieFound.getId());
        movieRepository.save(movie);
    }
}
