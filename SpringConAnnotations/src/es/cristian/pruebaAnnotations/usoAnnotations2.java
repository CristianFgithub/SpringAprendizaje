package es.cristian.pruebaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//leer el xml de configuracion

		//ClassPathXmlApplicationContext contexto;
		//contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//leer el class de configuracion
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		// pedir un bean al contenedor
		
		/*Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(empleado.getTareas());
		
		System.out.println(empleado.getInforme());*/
		
		DirectorFinanciero empleado = contexto.getBean("directorFinanciero",DirectorFinanciero.class);
		
		System.out.println(empleado.getEmail());
		
		System.out.println(empleado.getNombreEmpresa());
		
		
		//cerrar contexto
		contexto.close();
	}

}
