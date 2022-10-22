package com.example.demo.crud.jpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.crud.jpa.entity.UserEntity;
import com.example.demo.crud.jpa.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

//create
	public UserEntity createUser(UserEntity userEntity) {

		return this.userRepository.save(userEntity);
	}

//consultar
	public List<UserEntity> getUserAll() {
		return this.userRepository.findAll();
	}

//actualizar
	public UserEntity updateUser(UserEntity userEntity, Integer id) {
		userEntity.setId(id);
		return this.userRepository.save(userEntity);

	}

//eliminar
	public void deleteUser(Integer id) {
		this.userRepository.deleteById(id);
	}

//consultar por id
	public UserEntity getUserId(Integer id) {
		return this.userRepository.findById(id).get();
	}
}
