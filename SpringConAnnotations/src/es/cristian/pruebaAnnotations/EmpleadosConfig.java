package es.cristian.pruebaAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.cristian.pruebaAnnotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

	
	//definir el bean para informeFinancieroDtoCompras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras(){ //sera el ID del bean inyectado
		
		return new InformeFinancieroDtoCompras();
	}
	
	// Definir el bean para DirectorFinanciero e inyectar dependencias
	
	
	@Bean
	public Empleados directorFinanciero() {
		
		return new DirectorFinanciero(informeFinancieroDtoCompras());
		
	}
	
	
}
