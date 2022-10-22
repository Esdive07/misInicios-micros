package com.example.demo.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.crud.entity.DireccionEntity;
import com.example.demo.crud.repository.DireccionRepository;

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

//Actualizar
	public DireccionEntity updateDireccion(DireccionEntity direccionEntity, Integer id) {
		direccionEntity.setId(id);
		return this.direccionRepository.save(direccionEntity);
	}

	public void deleteDireccion(Integer id) {
		this.direccionRepository.deleteById(id);
	}
}
