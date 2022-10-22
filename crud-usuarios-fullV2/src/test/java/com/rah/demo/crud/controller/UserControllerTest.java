package com.rah.demo.crud.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.rah.demo.crud.entity.UserEntity;
import com.rah.demo.crud.service.UserService;

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
	public void getAllUserTest() {
		List<UserEntity> userEntities = new ArrayList<>();
		UserEntity userEntity = new UserEntity();
		userEntities.add(userEntity);

		when(this.userService.getAllUser()).thenReturn(userEntities);
		ResponseEntity<List<UserEntity>> response = this.userController.getAllUser();
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
	public void getByIdUserTest() {
		Integer id = 1;
		UserEntity userEntity = new UserEntity();

		when(this.userService.getByIdUser(id)).thenReturn(userEntity);
		ResponseEntity<UserEntity> response = this.userController.getByIdUser(id);
		assertNotNull(response);
	}
}
