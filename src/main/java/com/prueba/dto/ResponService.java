package com.prueba.dto;

public class ResponService {

	private String codeRespon = "";

	private String message = "";

	private Object respuesta;

	public ResponService() {
	}

	public ResponService(String codeRespon, String message, Object respuesta) {
		super();
		this.codeRespon = codeRespon;
		this.message = message;
		this.respuesta = respuesta;
	}

	public Object getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(Object respuesta) {
		this.respuesta = respuesta;
	}

	public String getCodeRespon() {
		return codeRespon;
	}

	public void setCodeRespon(String codeRespon) {
		this.codeRespon = codeRespon;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
