package com.example.demo.crud.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.crud.entity.DireccionEntity;
import com.example.demo.crud.repository.DireccionRepository;

public class DireccionServiceTest {

	private DireccionService direccionService;
	@Mock
	private DireccionRepository direccionRepository;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		this.direccionService = new DireccionService(direccionRepository);
	}

	@Test
	public void createDireccionTest() {
		DireccionEntity direccionEntity = new DireccionEntity();

		when(this.direccionRepository.save(direccionEntity)).thenReturn(direccionEntity);
		DireccionEntity response = this.direccionService.createDireccion(direccionEntity);
		assertNotNull(response);
	}

	@Test
	public void getDireccionAllTest() {
		List<DireccionEntity> listaDireccion = new ArrayList<>();
		DireccionEntity direccionEntity = new DireccionEntity();
		listaDireccion.add(direccionEntity);

		when(this.direccionRepository.findAll()).thenReturn(listaDireccion);
		List<DireccionEntity> response = this.direccionService.getDireccionAll();
		assertNotNull(response);
	}

	@Test
	public void updateDireccionTest() {
		DireccionEntity direccionEntity = new DireccionEntity();
		Integer id = 1;

		when(direccionRepository.save(direccionEntity)).thenReturn(direccionEntity);
		DireccionEntity response = this.direccionService.updateDireccion(direccionEntity, id);
		assertNotNull(response);
	}

	@Test
	public void deleteDireccionTest() {
		Integer id = 1;
		this.direccionService.deleteDireccion(id);
	}

}
