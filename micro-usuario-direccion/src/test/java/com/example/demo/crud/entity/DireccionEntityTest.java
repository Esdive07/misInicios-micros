package com.example.demo.crud.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DireccionEntityTest {

	private DireccionEntity direccionEntity;

	@BeforeEach
	public void init() {
		this.direccionEntity = new DireccionEntity();
	}

	@Test
	public void idTest() {
		Integer id = 1;
		this.direccionEntity.setId(id);
		assertEquals(id, this.direccionEntity.getId());
	}

	@Test
	public void codigoPostalTest() {
		Integer codigoPostal = 123;
		this.direccionEntity.setCodigoPostal(codigoPostal);
		assertEquals(codigoPostal, this.direccionEntity.getCodigoPostal());
	}

	@Test
	public void direccionTest() {
		String direccion = "general R";
		this.direccionEntity.setDireccion(direccion);
		assertEquals(direccion, this.direccionEntity.getDireccion());
	}

	@Test
	public void localidadTest() {
		String localidad = "carabanchel";
		this.direccionEntity.setLocalidad(localidad);
		assertEquals(localidad, this.direccionEntity.getLocalidad());
	}

	@Test
	public void numeroTest() {
		Integer numero = 69;
		this.direccionEntity.setNumero(numero);
		assertEquals(numero, this.direccionEntity.getNumero());
	}

	@Test
	public void puertaTest() {
		String puerta = "1E";
		this.direccionEntity.setPuerta(puerta);
		assertEquals(puerta, this.direccionEntity.getPuerta());
	}
}
