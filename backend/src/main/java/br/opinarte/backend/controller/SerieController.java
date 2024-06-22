package br.opinarte.backend.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.opinarte.backend.entity.Serie;
import br.opinarte.backend.request.SeriePostRequestBody;
import br.opinarte.backend.request.SeriePutRequestBody;
import br.opinarte.backend.service.SerieService;
import br.opinarte.backend.util.DateUtil;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping(path = "serie")
@Log4j2
@RequiredArgsConstructor
public class SerieController {
    private final SerieService serieService;
    private final DateUtil dateUtil;

    @GetMapping(path = "list")
    public ResponseEntity<List<Serie>> list() {
        return ResponseEntity.ok(serieService.listAll());
    }

    @GetMapping
    public ResponseEntity<Page<Serie>> listPageable(Pageable pageable) {
        return ResponseEntity.ok(serieService.listAll(pageable));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Serie> findById(@PathVariable Long id) {
        return ResponseEntity.ok(serieService.findById(id));
    }

    @GetMapping(path = "/find-by-name")
	public ResponseEntity<List<Serie>> findByName(@RequestParam(required = false) String name) {
		log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
		return ResponseEntity.ok(serieService.findByName(name));
	}

    @PostMapping
    public ResponseEntity<Serie> save(@RequestBody @Valid SeriePostRequestBody seriePostRequestBody) {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return new ResponseEntity<>(serieService.save(seriePostRequestBody), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        serieService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody @Valid SeriePutRequestBody SeriePutRequestBody) {
        serieService.replace(SeriePutRequestBody);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
