package com.rah.demo.crud.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.rah.demo.crud.entity.DireccionEntity;
import com.rah.demo.crud.entity.UserEntity;
import com.rah.demo.crud.repository.UserRepository;

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
		userEntity.setDocumento(123);
		userEntity.setNombre("Robin");
		userEntity.setApellido("De Diaz");

		List<DireccionEntity> direccionEntities = new ArrayList<>();
		userEntity.setDireccionEntities(direccionEntities);

		when(this.userRepository.save(userEntity)).thenReturn(userEntity);
		UserEntity response = this.userService.createUser(userEntity);
		assertNotNull(response);
	}

	@Test
	public void getAllUserTest() {
		List<UserEntity> lisEntities = new ArrayList<>();
		UserEntity userEntity = new UserEntity();
		lisEntities.add(userEntity);

		when(this.userRepository.findAll()).thenReturn(lisEntities);
		List<UserEntity> response = this.userService.getAllUser();
		assertNotNull(response);
	}

	@Test
	public void updateUserIfTrueTest() {
		UserEntity userEntity = new UserEntity();
		Integer id = 1;
		List<DireccionEntity> lisDireccionEntities = new ArrayList<>();

		userEntity.setEdad(20);
		userEntity.setDireccionEntities(lisDireccionEntities);

		when(this.userRepository.save(userEntity)).thenReturn(userEntity);
		UserEntity response = this.userService.updateUser(userEntity, id);
		assertNotNull(response);
	}

	@Test
	public void updateUserIfFalseTest() {
		UserEntity userEntity = new UserEntity();
		Integer id = 1;
		List<DireccionEntity> lisDireccionEntities = new ArrayList<>();

		userEntity.setEdad(10);
		userEntity.setDireccionEntities(lisDireccionEntities);

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
	public void getByIdUserTest() {
		Integer id = 1;
		UserEntity userEntity = new UserEntity();
		Optional<UserEntity> userOptional = Optional.of(userEntity);

		when(this.userRepository.findById(id)).thenReturn(userOptional);
		UserEntity response = this.userService.getByIdUser(id);
		assertNotNull(response);
	}

}
