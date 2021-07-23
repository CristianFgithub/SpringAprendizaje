package es.cristian.IOC;

import java.io.IOException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creación de objetos de tipo empleado
		
		/*Empleados Empleado1 = new SecretarioEmpleado();
		
		
		//Uso de los objetos Creados
		
		System.out.println(Empleado1.getTareas());*/
		ClassPathXmlApplicationContext contexto;
		contexto = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
		
		/*Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());*/
		
		/*SecretarioEmpleado Maria = contexto.getBean("miSecretario", SecretarioEmpleado.class);
		
		System.out.println(Maria.getTareas());
		
		System.out.println(Maria.getInforme());
		
		System.out.println("Email: " +Maria.getEmail());
		
		System.out.println(Maria.getNombreEmpresa());*/
		
		DirectorEmpleado juan= contexto.getBean("miDirector",DirectorEmpleado.class);
		
		System.out.println(juan.getTareas());
		
		System.out.println(juan.getInforme());
		
		System.out.println("Email: " + juan.getEmail());
		
		System.out.println(juan.getNombreEmpresa());
		contexto.close();
	}

}
