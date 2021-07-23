package es.cristian.IOC;

public class DirectorEmpleado implements Empleados {

	//Creación de campo tipo CreaciónInforme (interfaz)
	
	private CreacionInformes informeNuevo;
	
	private String email, nombreEmpresa;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	//Creación de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		// TODO Auto-generated constructor stub
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}
	
	// crear método init. Ejecutar tareas antes de que el bean este disponible
	
	public void metodoInicial() {
		
		System.out.println("Dentro del método init. Aquí irían las tareas a ejecutar antes del que el bean este listo");
		
		
	}
	
	// metodo destroy. Ejecutar tareas edspues de que el bean haya sido utilizado
	
	public void metodoFinal() {
		
		System.out.println("Dentro del método Destroy. Aquí irían las tareas a ejecutar despues de que termine el bean");
		
		
	}
	

}
