package com.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.dto.DatosCirculoDto;
import com.prueba.dto.DatosDto;
import com.prueba.dto.ResponService;
import com.prueba.infrastructure.InfrestructureService;
import com.prueba.infrastructure.impl.InfrastructureServiceImpl;

@RestController
@RequestMapping("/Funciones")
public class Controller {
	
	
	private ResponService responService = null;
	
	@Autowired
	private InfrestructureService infrastructureServiceImpl;
	// Area de un triangulo
		@PostMapping(value = "/areaTriangulo", produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus(HttpStatus.OK)
		public @ResponseBody ResponService areaTriangulo(@RequestBody DatosDto datosDto) {
			try {
				return InfrestructureService.areaTriangulo(datosDto);
			} catch (Exception e) {
				e.getMessage();
				return responService = new ResponService("Error", "404", false);
			}

		}
		
		
		// Area de un triangulo
			@PostMapping(value = "/areaCirculo", produces = MediaType.APPLICATION_JSON_VALUE)
			@ResponseStatus(HttpStatus.OK)
			public @ResponseBody ResponService areaCirculo(@RequestBody DatosCirculoDto datosCirculoDto) {
				try {
					return InfrestructureService.areaCirculo(datosCirculoDto);
				} catch (Exception e) {
					e.getMessage();
					return responService = new ResponService("Error", "404", false);
				}

			}

}
