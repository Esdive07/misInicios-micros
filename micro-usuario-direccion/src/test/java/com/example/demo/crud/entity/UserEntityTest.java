package com.example.demo.crud.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserEntityTest {
	private UserEntity userEntity;

	@BeforeEach
	public void init() {
		this.userEntity = new UserEntity();
	}

	@Test
	public void nombreTest() {
		String nombre = "prueba";

		this.userEntity.setNombre(nombre);

		assertEquals(nombre, this.userEntity.getNombre());
	}

	@Test
	public void apellidoTest() {

		String apellido = "apellido";

		this.userEntity.setApellido(apellido);

		assertEquals(apellido, this.userEntity.getApellido());
	}

	@Test
	public void edadTest() {

		String edad = "20";

		this.userEntity.setEdad(edad);

		assertEquals(edad, this.userEntity.getEdad());

	}

	@Test
	public void documentoTest() {

		Integer documento = 123456;

		this.userEntity.setDocumento(documento);

		assertEquals(documento, this.userEntity.getDocumento());
	}

	@Test
	public void idTest() {

		Integer id = 1;

		this.userEntity.setId(id);

		assertEquals(id, this.userEntity.getId());
	}
}
