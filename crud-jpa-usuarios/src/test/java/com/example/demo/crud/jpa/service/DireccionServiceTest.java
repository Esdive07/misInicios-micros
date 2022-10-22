package com.example.demo.crud.jpa.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.crud.jpa.entity.DireccionEntity;
import com.example.demo.crud.jpa.repository.DireccionRepository;

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

		List<DireccionEntity> listEntities = new ArrayList<>();
		DireccionEntity direccionEntity = new DireccionEntity();
		listEntities.add(direccionEntity);

		when(this.direccionRepository.findAll()).thenReturn(listEntities);
		List<DireccionEntity> response = this.direccionService.getDireccionAll();
		assertNotNull(response);
	}

	@Test
	public void updateDireccionTest() {
		DireccionEntity direccionEntity = new DireccionEntity();
		Integer id = 1;

		when(this.direccionRepository.save(direccionEntity)).thenReturn(direccionEntity);
		DireccionEntity response = this.direccionService.updateDireccion(direccionEntity, id);
		assertNotNull(response);
	}

	@Test
	public void deleteDireccionTest() {
		Integer id = 1;
		this.direccionService.deleteDireccion(id);
	}

	@Test
	public void getDireccionIdTest() {
		Integer id = 1;
		DireccionEntity direccionEntity = new DireccionEntity();
		Optional<DireccionEntity> direOptional = Optional.of(direccionEntity);

		when(this.direccionRepository.findById(id)).thenReturn(direOptional);
		DireccionEntity response = this.direccionService.getDireccionId(id);
		assertNotNull(response);
	}

}
