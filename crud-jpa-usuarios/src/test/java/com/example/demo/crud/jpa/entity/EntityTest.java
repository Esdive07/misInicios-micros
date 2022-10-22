package com.example.demo.crud.jpa.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EntityTest {

	private UserEntity userEntity;
	private DireccionEntity direccionEntity;
	private DatosContactoEntity datosContactoEntity;

	@BeforeEach
	public void init() {
		this.userEntity = new UserEntity();
		this.direccionEntity = new DireccionEntity();
		this.datosContactoEntity = new DatosContactoEntity();
	}

	@Test
	public void userEntity() {
		Integer id = 1;
		String nombre = "Esme";
		String apellido = "Diaz";
		String edad = "28";
		String documento = "1026";

		List<DireccionEntity> direccionEntities = new ArrayList<>();
		List<DatosContactoEntity> datosContactoEntities = new ArrayList<>();

		this.userEntity.setId(id);
		this.userEntity.setNombre(nombre);
		this.userEntity.setApellido(apellido);
		this.userEntity.setEdad(edad);
		this.userEntity.setDocumento(documento);
		this.userEntity.setDireccionEntities(direccionEntities);
		this.userEntity.setDatosContactoEntities(datosContactoEntities);

		assertEquals(id, this.userEntity.getId());
		assertEquals(nombre, this.userEntity.getNombre());
		assertEquals(apellido, this.userEntity.getApellido());
		assertEquals(edad, this.userEntity.getEdad());
		assertEquals(documento, this.userEntity.getDocumento());
		assertNotNull(this.userEntity.getDireccionEntities());
		assertNotNull(this.userEntity.getDatosContactoEntities());
	}

	@Test
	public void direccionEntityTest() {
		Integer id = 1;
		String calle = "General";
		String localidad = "carabanchel";
		Integer numero = 69;
		String puerta = "1e";
		Integer codigoPostal = 28019;
		UserEntity userEntity = new UserEntity();

		this.direccionEntity.setId(id);
		this.direccionEntity.setCalle(calle);
		this.direccionEntity.setLocalidad(localidad);
		this.direccionEntity.setNumero(numero);
		this.direccionEntity.setPuerta(puerta);
		this.direccionEntity.setCodigoPostal(codigoPostal);
		this.direccionEntity.setUserEntity(userEntity);

		assertEquals(id, this.direccionEntity.getId());
		assertEquals(calle, this.direccionEntity.getCalle());
		assertEquals(localidad, this.direccionEntity.getLocalidad());
		assertEquals(numero, this.direccionEntity.getNumero());
		assertEquals(puerta, this.direccionEntity.getPuerta());
		assertEquals(codigoPostal, this.direccionEntity.getCodigoPostal());
		assertEquals(userEntity, this.direccionEntity.getUserEntity());
	}

	@Test
	public void datosContactoEntity() {
		Integer id = 1;
		String email = "prueba@gmail.com";
		String celular = "322222";
		String telFijo = "23456";
		UserEntity userEntity = new UserEntity();

		this.datosContactoEntity.setId(id);
		this.datosContactoEntity.setEmail(email);
		this.datosContactoEntity.setCelular(celular);
		this.datosContactoEntity.setTelFijo(telFijo);
		this.datosContactoEntity.setUserEntity(userEntity);

		assertEquals(id, this.datosContactoEntity.getId());
		assertEquals(email, this.datosContactoEntity.getEmail());
		assertEquals(celular, this.datosContactoEntity.getCelular());
		assertEquals(telFijo, this.datosContactoEntity.getTelFijo());
		assertEquals(userEntity, this.datosContactoEntity.getUserEntity());

	}
}
