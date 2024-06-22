package br.opinarte.backend.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.opinarte.backend.entity.Serie;
import br.opinarte.backend.exception.BadRequestException;
import br.opinarte.backend.mapper.SerieMapper;
import br.opinarte.backend.repository.SerieRepository;
import br.opinarte.backend.request.SeriePostRequestBody;
import br.opinarte.backend.request.SeriePutRequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SerieService {
    private final SerieRepository serieRepository;

    @Transactional
    public Serie save(@Valid SeriePostRequestBody SeriePostRequestBody) {
        return serieRepository.save(SerieMapper.INSTANCE.toSerie(SeriePostRequestBody));
    }

    public List<Serie> listAll() {
        return serieRepository.findAll();
    }

    public Page<Serie> listAll(Pageable pageable) {
        return serieRepository.findAll(pageable);
    }

    public Serie findById(Long id) {
        return serieRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Serie not found"));
    }

    public List<Serie> findByName(String name) {
		return serieRepository.findByName(name);
	}

    public void delete(Long id) {
        serieRepository.delete(this.findById(id));
    }

    public void replace(@Valid SeriePutRequestBody seriePutRequestBody) {
        Serie serieFound = this.findById(seriePutRequestBody.getId());
        Serie serie = SerieMapper.INSTANCE.toSerie(seriePutRequestBody);
        serie.setId(serieFound.getId());
        serieRepository.save(serie);
    }
}
