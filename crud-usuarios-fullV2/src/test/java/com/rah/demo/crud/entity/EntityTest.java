package com.rah.demo.crud.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EntityTest {

	private UserEntity userEntity;
	private DireccionEntity direccionEntity;

	@BeforeEach
	public void init() {
		this.userEntity = new UserEntity();
		this.direccionEntity = new DireccionEntity();
	}

	@Test
	public void userEntityTest() {
		Integer id = 1;
		Integer documento = 123;
		String nombre = "Diana";
		String apellido = "Diaz";
		Integer edad = 21;
		List<DireccionEntity> direccionEntities = new ArrayList<>();

		this.userEntity.setId(id);
		this.userEntity.setDocumento(documento);
		this.userEntity.setNombre(nombre);
		this.userEntity.setApellido(apellido);
		this.userEntity.setEdad(edad);
		this.userEntity.setDireccionEntities(direccionEntities);

		assertEquals(id, userEntity.getId());
		assertEquals(documento, userEntity.getDocumento());
		assertEquals(nombre, this.userEntity.getNombre());
		assertEquals(apellido, this.userEntity.getApellido());
		assertEquals(edad, this.userEntity.getEdad());
		assertNotNull(this.userEntity.getDireccionEntities());
	}

	@Test
	public void direccionEntityTest() {
		Integer id = 1;
		Integer codigoPostal = 1234;
		String localidad = "prueba";
		Integer calle = 69;
		String puerta = "1d";
		UserEntity userEntity = new UserEntity();

		this.direccionEntity.setId(id);
		this.direccionEntity.setCodigoPostal(codigoPostal);
		this.direccionEntity.setLocalidad(localidad);
		this.direccionEntity.setCalle(calle);
		this.direccionEntity.setPuerta(puerta);
		this.direccionEntity.setUserEntity(userEntity);

		assertEquals(id, this.direccionEntity.getId());
		assertEquals(codigoPostal, this.direccionEntity.getCodigoPostal());
		assertEquals(localidad, this.direccionEntity.getLocalidad());
		assertEquals(calle, this.direccionEntity.getCalle());
		assertEquals(puerta, this.direccionEntity.getPuerta());
		assertNotNull(this.direccionEntity.getUserEntity());
	}

}
