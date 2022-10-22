package com.example.demo.crud.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.crud.entity.DireccionEntity;
import com.example.demo.crud.service.DireccionService;

public class DireccionControllerTest {

	private DireccionController direccionController;
	@Mock
	private DireccionService direccionService;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		this.direccionController = new DireccionController(direccionService);
	}

	@Test
	public void createDireccionTest() {
		DireccionEntity direccionEntity = new DireccionEntity();

		when(this.direccionService.createDireccion(direccionEntity)).thenReturn(direccionEntity);
		DireccionEntity response = this.direccionController.createDireccion(direccionEntity);
		assertNotNull(response);
	}

	@Test
	public void getDireccionAllTest() {
		List<DireccionEntity> listaDireccion = new ArrayList<>();
		DireccionEntity direccionEntity = new DireccionEntity();
		listaDireccion.add(direccionEntity);

		when(this.direccionService.getDireccionAll()).thenReturn(listaDireccion);
		List<DireccionEntity> response = this.direccionController.getDireccionAll();
		assertNotNull(response);

	}

	@Test
	public void updateDireccionTest() {
		DireccionEntity direccionEntity = new DireccionEntity();
		Integer id = 1;

		when(this.direccionService.updateDireccion(direccionEntity, id)).thenReturn(direccionEntity);
		DireccionEntity response = this.direccionController.updateDireccion(direccionEntity, id);
		assertNotNull(response);
	}

	@Test
	public void deleteDireccionTest() {
		Integer id = 1;
		this.direccionController.deleteDireccion(id);
	}
}
