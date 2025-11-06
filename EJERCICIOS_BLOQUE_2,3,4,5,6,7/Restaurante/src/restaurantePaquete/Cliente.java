package restaurantePaquete;

public class Cliente {
	
	private String nombre;
	private String numeroContacto;
	
	
	public Cliente() {
		
	}


	public Cliente(String nombre, String numeroContacto) {
		super();
		this.nombre = nombre;
		this.numeroContacto = numeroContacto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNumeroContacto() {
		return numeroContacto;
	}


	public void setNumeroContacto(String numeroContacto) {
		this.numeroContacto = numeroContacto;
	}
	
	public void registrar() {
		System.out.println("Cliente ha sido registrado con exito.");
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", numeroContacto=" + numeroContacto + "]";
	}
	
	
	
	

}
