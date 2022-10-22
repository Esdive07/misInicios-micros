package com.example.demo.crud.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "users")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String apellido;
	private String edad;
	private String documento;

	@OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<DireccionEntity> direccionEntities;

	@OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<DatosContactoEntity> datosContactoEntities;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public List<DireccionEntity> getDireccionEntities() {
		return direccionEntities;
	}

	public void setDireccionEntities(List<DireccionEntity> direccionEntities) {
		this.direccionEntities = direccionEntities;
	}

	public List<DatosContactoEntity> getDatosContactoEntities() {
		return datosContactoEntities;
	}

	public void setDatosContactoEntities(List<DatosContactoEntity> datosContactoEntities) {
		this.datosContactoEntities = datosContactoEntities;
	}

}
