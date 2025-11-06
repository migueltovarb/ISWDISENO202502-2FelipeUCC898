package tallerVehiculos;

import java.util.List;

public class Propietario {
	
	private String nombre;
	private String numeroContacto;
	private List<Vehiculo> vehiculos;
	public Propietario() {
		super();
	}
	public Propietario(String nombre, String numeroContacto, List<Vehiculo> vehiculos) {
		super();
		this.nombre = nombre;
		this.numeroContacto = numeroContacto;
		this.vehiculos = vehiculos;
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
	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	private void registrar () {
		System.out.println("Propietario registrado con exito.");
	}
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", numeroContacto=" + numeroContacto + ", vehiculos=" + vehiculos
				+ "]";
	}
	
	
	
	
}
