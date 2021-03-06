package es.cristian.pruebaAnnotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados, InitializingBean, DisposableBean {

	//ejecuci?n de c?digo despu?s de creaci?n del Bean
	

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Ejecutando antes de la destrucci?n");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Ejecutado tras creaci?n de Bean");
		
	}
		
		
	
	// Ejecuci?n de c?digo despu?s de apagado contenedor Spring
	
		
	
	
	@Autowired
	@Qualifier("informeFinancieroTrim4") //Bean que debe utilizar
	private CreacionInformeFinanciero nuevoInforme;

	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender mas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}



	
	
}
