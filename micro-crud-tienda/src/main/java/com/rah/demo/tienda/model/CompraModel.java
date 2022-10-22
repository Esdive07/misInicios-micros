package com.rah.demo.tienda.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class CompraModel {

	private Integer id;
	private float valorCompra;
	private Integer cantidad;
	private Date fechaCompra;
	private ProductoModel producto;
}
