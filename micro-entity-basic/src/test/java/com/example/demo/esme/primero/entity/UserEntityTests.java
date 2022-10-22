package com.example.demo.esme.primero.entity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserEntityTests {
	// atributo
	private UserEntity userEntity;

	@BeforeEach
	public void init() {

		this.userEntity = new UserEntity();
	}

	// mètodo
	@Test
	public void nombreTest() {

		String nombre = "Robin";

		this.userEntity.setNombre(nombre);

		assertEquals(nombre, this.userEntity.getNombre());
	}

	@Test
	public void apellidoTest() {

		String apellido = "Arellano";

		this.userEntity.setApellido(apellido);

		assertEquals(apellido, this.userEntity.getApellido());

	}

	@Test
	public void edadTest() {

		Integer edad = 32;
		Integer edad2 = 27;

		this.userEntity.setEdad(edad);

		assertNotNull(this.userEntity.getEdad());

		assertNotEquals(edad2, this.userEntity.getEdad());
	}

	@Test
	public void idTest() {

		int id = 1234;

		this.userEntity.setId(id);

		assertThat(this.userEntity.getId()).isEqualTo(id);

	}

}
