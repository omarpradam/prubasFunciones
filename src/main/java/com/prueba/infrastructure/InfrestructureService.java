package com.prueba.infrastructure;

import com.prueba.dto.DatosCirculoDto;
import com.prueba.dto.DatosDto;
import com.prueba.dto.ResponService;

public interface InfrestructureService {


	public static  ResponService areaTriangulo(DatosDto datosDto) throws Exception {

		Float Respuesta = (datosDto.getBase()* datosDto.getAltura())/2;

		
		
		return new ResponService("successful", "200", Respuesta);
	}
	
	public static  ResponService areaCirculo(DatosCirculoDto datosCirculoDto) throws Exception {

		 Double Respuesta=Math.PI*(datosCirculoDto.getRadio()*datosCirculoDto.getRadio()); 

		
		
		return new ResponService("successful", "200", Respuesta);
	}
}
