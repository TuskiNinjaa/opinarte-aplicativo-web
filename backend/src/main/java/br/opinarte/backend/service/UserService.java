package br.opinarte.backend.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.opinarte.backend.entity.User;
import br.opinarte.backend.exception.BadRequestException;
import br.opinarte.backend.mapper.UserMapper;
import br.opinarte.backend.repository.UserRepository;
import br.opinarte.backend.request.UserPostRequestBody;
import br.opinarte.backend.request.UserPutRequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;

	@Transactional
	public User save(@Valid UserPostRequestBody userPostRequestBody) {
		return userRepository.save(UserMapper.INSTANCE.toUser(userPostRequestBody));
	}

	public List<User> listAll() {
		return userRepository.findAll();
	}

	public Page<User> listAllPageable(Pageable pageable) {
		return userRepository.findAll(pageable);
	}

	public User findById(Long id) {
		return userRepository.findById(id)
				.orElseThrow(() -> new BadRequestException("User not found"));
	}

	public List<User> findByName(String name) {
		return userRepository.findByName(name);
	}

	public void delete(Long id) {
		userRepository.delete(this.findById(id));
	}

	public void replace(UserPutRequestBody userPutRequestBody) {
		User userFound = findById(userPutRequestBody.getId());
		User user = UserMapper.INSTANCE.toUser(userPutRequestBody);
		user.setId(userFound.getId());
		userRepository.save(user);
	}

}
