package com.example.demo.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.crud.entity.DireccionEntity;
import com.example.demo.crud.service.DireccionService;

@RestController
@RequestMapping("/direccion")
public class DireccionController {
	private DireccionService direccionService;

	public DireccionController(DireccionService direccionService) {
		super();
		this.direccionService = direccionService;
	}

	// crear
	@PostMapping
	public DireccionEntity createDireccion(@RequestBody DireccionEntity direccionEntity) {
		return this.direccionService.createDireccion(direccionEntity);
	}

	// actualizar
	@GetMapping
	public List<DireccionEntity> getDireccionAll() {
		return this.direccionService.getDireccionAll();
	}

	// actualizar
	@PutMapping("/{id}")
	public DireccionEntity updateDireccion(@RequestBody DireccionEntity direccionEntity, @PathVariable Integer id) {
		return this.direccionService.updateDireccion(direccionEntity, id);
	}

	// delete
	@DeleteMapping("/{id}")
	public void deleteDireccion(@PathVariable Integer id) {
		this.direccionService.deleteDireccion(id);
	}
}
