package com.example.demo.crud.jpa.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.crud.jpa.entity.DatosContactoEntity;
import com.example.demo.crud.jpa.repository.DatosContactoRepository;

public class DatosContactoServiceTest {

	private DatosContactoService datosContactoService;
	@Mock
	private DatosContactoRepository datosContactoRepository;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		this.datosContactoService = new DatosContactoService(datosContactoRepository);
	}

	@Test
	public void createDatosContactoTest() {
		DatosContactoEntity datosContactoEntity = new DatosContactoEntity();

		when(this.datosContactoRepository.save(datosContactoEntity)).thenReturn(datosContactoEntity);
		DatosContactoEntity response = this.datosContactoService.createDatosContacto(datosContactoEntity);
		assertNotNull(response);
	}
}
