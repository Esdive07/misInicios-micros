package com.example.demo.crud.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.crud.entity.UserEntity;
import com.example.demo.crud.service.UserService;

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
		UserEntity response = this.userController.createUser(userEntity);
		assertNotNull(response);
	}

	@Test
	public void getUserAllTest() {
		List<UserEntity> listUser = new ArrayList<>();
		UserEntity userEntity = new UserEntity();
		listUser.add(userEntity);

		when(this.userService.getUserAll()).thenReturn(listUser);
		List<UserEntity> response = this.userController.getUserAll();
		assertNotNull(response);
	}

	@Test
	public void updateUserTest() {
		UserEntity userEntity = new UserEntity();
		Integer id = 1;

		when(this.userService.updateUser(userEntity, id)).thenReturn(userEntity);
		UserEntity response = this.userController.updateUser(userEntity, id);
		assertNotNull(response);
	}

	@Test
	public void deleteUserTest() {
		Integer id = 1;
		this.userController.deleteUser(id);
	}

}
