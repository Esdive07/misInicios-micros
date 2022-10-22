package com.example.demo.crud.jpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.crud.jpa.entity.DireccionEntity;
import com.example.demo.crud.jpa.repository.DireccionRepository;

@Service
public class DireccionService {

	private DireccionRepository direccionRepository;

	public DireccionService(DireccionRepository direccionRepository) {
		super();
		this.direccionRepository = direccionRepository;
	}

//crear
	public DireccionEntity createDireccion(DireccionEntity direccionEntity) {
		return this.direccionRepository.save(direccionEntity);
	}

//consultar
	public List<DireccionEntity> getDireccionAll() {
		return this.direccionRepository.findAll();
	}

//actualizar
	public DireccionEntity updateDireccion(DireccionEntity direccionEntity, Integer id) {
		direccionEntity.setId(id);
		return this.direccionRepository.save(direccionEntity);
	}

//eliminar
	public void deleteDireccion(Integer id) {
		this.direccionRepository.deleteById(id);
	}

//consular por id	
	public DireccionEntity getDireccionId(Integer id) {
		return this.direccionRepository.findById(id).get();
	}
}
