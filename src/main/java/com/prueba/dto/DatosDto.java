package com.prueba.dto;

public class DatosDto {

	Float altura;

	Float base;

	public DatosDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DatosDto(Float altura, Float base) {
		super();
		this.altura = altura;
		this.base = base;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getBase() {
		return base;
	}

	public void setBase(Float base) {
		this.base = base;
	}

}
