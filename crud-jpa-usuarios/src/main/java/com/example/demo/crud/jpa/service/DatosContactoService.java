package com.example.demo.crud.jpa.service;

import org.springframework.stereotype.Service;

import com.example.demo.crud.jpa.entity.DatosContactoEntity;
import com.example.demo.crud.jpa.repository.DatosContactoRepository;

@Service
public class DatosContactoService {
	private DatosContactoRepository datosContactoRepository;

	public DatosContactoService(DatosContactoRepository datosContactoRepository) {
		super();
		this.datosContactoRepository = datosContactoRepository;
	}

//create
	public DatosContactoEntity createDatosContacto(DatosContactoEntity datosContactoEntity) {
		return this.datosContactoRepository.save(datosContactoEntity);

	}
}
