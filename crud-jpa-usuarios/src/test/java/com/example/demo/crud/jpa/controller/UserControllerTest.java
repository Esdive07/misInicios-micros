package com.example.demo.crud.jpa.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.example.demo.crud.jpa.entity.UserEntity;
import com.example.demo.crud.jpa.service.UserService;

public class UserControllerTest {

	private UserController userController;
	@Mock
	private UserService userService;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		this.userController = new UserController(userService);
	}

	@Test
	public void createUserTest() {
		UserEntity userEntity = new UserEntity();

		when(this.userService.createUser(userEntity)).thenReturn(userEntity);
		ResponseEntity<UserEntity> response = this.userController.createUser(userEntity);
		assertNotNull(response);
	}

	@Test
	public void getUserAllTest() {
		List<UserEntity> lisEntities = new ArrayList<>();
		UserEntity userEntity = new UserEntity();
		lisEntities.add(userEntity);

		when(this.userService.getUserAll()).thenReturn(lisEntities);
		ResponseEntity<List<UserEntity>> response = this.userController.getUserAll();
		assertNotNull(response);
	}

	@Test
	public void updateUserTest() {
		UserEntity userEntity = new UserEntity();
		Integer id = 1;

		when(this.userService.updateUser(userEntity, id)).thenReturn(userEntity);
		ResponseEntity<UserEntity> response = this.userController.updateUser(userEntity, id);
		assertNotNull(response);
	}

	@Test
	public void deleteUserTest() {
		Integer id = 1;
		this.userController.deleteUser(id);
	}

	@Test
	public void getUserIdTest() {
		Integer id = 1;
		UserEntity userEntity = new UserEntity();

		when(this.userService.getUserId(id)).thenReturn(userEntity);
		ResponseEntity<UserEntity> response = this.userController.getUserId(id);
		assertNotNull(response);
	}
}
