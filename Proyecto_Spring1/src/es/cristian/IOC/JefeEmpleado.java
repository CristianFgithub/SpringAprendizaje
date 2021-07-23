package es.cristian.IOC;

public class JefeEmpleado implements Empleados {

	public JefeEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;
	
	public String getTareas() {
		
		return "Gestiono las cuestiones";
		
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}
	
	
}
