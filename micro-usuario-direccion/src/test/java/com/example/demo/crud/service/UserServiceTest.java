package com.example.demo.crud.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.crud.entity.UserEntity;
import com.example.demo.crud.repository.UserRepository;

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
		userEntity.setId(3);
		when(this.userRepository.save(userEntity)).thenReturn(userEntity);

		UserEntity response = this.userService.createUser(userEntity);
		assertNotNull(response);
		assertEquals(3, response.getId());
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
	public void getUserAllTest() {
		List<UserEntity> listUser = new ArrayList<>();
		UserEntity userEntity = new UserEntity();
		userEntity.setId(1);
		listUser.add(userEntity);
		listUser.add(userEntity);
		listUser.add(userEntity);

		when(this.userRepository.findAll()).thenReturn(listUser);
		List<UserEntity> response = this.userService.getUserAll();
		assertNotNull(response);
		assertThat(response.size()).isEqualTo(3);
		assertThat(response.get(0).getId()).isEqualTo(1);
	}

	@Test
	public void deleteUserTest() {
		Integer id = 1;
		this.userService.deleteUser(id);
	}
}
