package br.opinarte.backend.controller;

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

import br.opinarte.backend.entity.User;
import br.opinarte.backend.request.UserPostRequestBody;
import br.opinarte.backend.request.UserPutRequestBody;
import br.opinarte.backend.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "user")
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;

	@GetMapping(path = "list")
	public ResponseEntity<List<User>> list() {
		return ResponseEntity.ok(userService.listAll());
	}

	@GetMapping
	public ResponseEntity<Page<User>> listPageable(Pageable pageable) {
		return ResponseEntity.ok(userService.listAllPageable(pageable));
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		return ResponseEntity.ok(userService.findById(id));
	}

	@GetMapping(path = "/find-by-name")
	public ResponseEntity<List<User>> findByName(@RequestParam(required = true) String name) {
		return ResponseEntity.ok(userService.findByName(name));
	}

	@PostMapping
	public ResponseEntity<User> save(@RequestBody @Valid UserPostRequestBody userPostRequestBody) {
		return new ResponseEntity<>(userService.save(userPostRequestBody), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<User> delete(@PathVariable Long id) {
		userService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PutMapping
	public ResponseEntity<User> replace(@RequestBody UserPutRequestBody userPutRequestBody) {
		userService.replace(userPutRequestBody);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
