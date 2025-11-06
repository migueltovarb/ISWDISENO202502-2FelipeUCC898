package tallerVehiculos;

import java.util.List;

public class Taller {
	
	private List<Vehiculo> vehiculos;
	private List<Propietario> propietarios;
	private String nombre;
	public Taller() {
		super();
	}
	public Taller(List<Vehiculo> vehiculos, List<Propietario> propietarios, String nombre) {
		super();
		this.vehiculos = vehiculos;
		this.propietarios = propietarios;
		this.nombre = nombre;
	}
	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	public List<Propietario> getPropietarios() {
		return propietarios;
	}
	public void setPropietarios(List<Propietario> propietarios) {
		this.propietarios = propietarios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Taller [vehiculos=" + vehiculos + ", propietarios=" + propietarios + ", nombre=" + nombre + "]";
	}
	
	
	
}
