package es.cristian.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador_Alumno {

	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(){
		
		return "HolaAlumnosFormulario";
		
		
		
		
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		
		return "HolaAlumnosSpring";
		
	}
	
	
}
