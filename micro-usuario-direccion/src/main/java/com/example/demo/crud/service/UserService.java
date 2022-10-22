package com.example.demo.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.crud.entity.UserEntity;
import com.example.demo.crud.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	// crear
	public UserEntity createUser(UserEntity userEntity) {

		return this.userRepository.save(userEntity);

	}

	// Consultar todos
	public List<UserEntity> getUserAll() {
		return this.userRepository.findAll();
	}

	// actualizar
	public UserEntity updateUser(UserEntity userEntity, Integer id) {
		userEntity.setId(id);
		return this.userRepository.save(userEntity);
	}

	// delete
	public void deleteUser(Integer id) {
		this.userRepository.deleteById(id);
	}
}
