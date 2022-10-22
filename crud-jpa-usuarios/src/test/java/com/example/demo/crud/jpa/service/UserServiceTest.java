package com.example.demo.crud.jpa.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.crud.jpa.entity.UserEntity;
import com.example.demo.crud.jpa.repository.UserRepository;

public class UserServiceTest {

	private UserService userService;
	@Mock
	private UserRepository userRepository;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		this.userService = new UserService(userRepository);
	}

	@Test
	public void createUserTest() {
		UserEntity userEntity = new UserEntity();

		when(this.userRepository.save(userEntity)).thenReturn(userEntity);
		UserEntity response = this.userService.createUser(userEntity);
		assertNotNull(response);
	}

	@Test
	public void getUserAllTest() {
		List<UserEntity> listaEntity = new ArrayList<>();
		UserEntity userEntity = new UserEntity();
		listaEntity.add(userEntity);

		when(this.userRepository.findAll()).thenReturn(listaEntity);
		List<UserEntity> response = this.userService.getUserAll();
		assertNotNull(response);
	}

	@Test
	public void updateUserTest() {
		UserEntity userEntity = new UserEntity();
		Integer id = 1;

		when(this.userRepository.save(userEntity)).thenReturn(userEntity);
		UserEntity response = this.userService.updateUser(userEntity, id);
		assertNotNull(response);
	}

	@Test
	public void deleteUserTest() {
		Integer id = 1;
		this.userService.deleteUser(id);
	}

	@Test
	public void getUserIdTest() {
		Integer id = 1;
		UserEntity userEntity = new UserEntity();
		Optional<UserEntity> userOptional = Optional.of(userEntity);

		when(this.userRepository.findById(id)).thenReturn(userOptional);
		UserEntity response = this.userService.getUserId(id);
		assertNotNull(response);
	}
}
