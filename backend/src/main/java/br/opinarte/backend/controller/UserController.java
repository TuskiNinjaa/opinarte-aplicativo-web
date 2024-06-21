package br.opinarte.backend.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.opinarte.backend.entity.User;
import br.opinarte.backend.request.UserPostRequestBody;
import br.opinarte.backend.service.UserService;
import br.opinarte.backend.util.DateUtil;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("user")
@Log4j2
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	private final DateUtil dateUtil;

	@GetMapping("list")
	public ResponseEntity<List<User>> list() {
		return ResponseEntity.ok(userService.listAll());
	}

	@GetMapping
	public ResponseEntity<Page<User>> listPageable(Pageable pageable) {
		return ResponseEntity.ok(userService.listAll(pageable));
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		return ResponseEntity.ok(userService.findById(id));
	}

	@GetMapping(path = "/find-by-name")
	public ResponseEntity<List<User>> findByName(@RequestParam(required = false) String name) {
		log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
		return ResponseEntity.ok(userService.findByName(name));
	}

	@PostMapping
	public ResponseEntity<User> save(@RequestBody @Valid UserPostRequestBody userPostRequestBody) {
		log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
		return new ResponseEntity<>(userService.save(userPostRequestBody), HttpStatus.CREATED);
	}

}
