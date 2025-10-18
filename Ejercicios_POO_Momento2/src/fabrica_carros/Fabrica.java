package fabrica_carros;

import java.util.List;

public class Fabrica {
	
	private String nombre;
	private List<Planta> planta;
	
	public Fabrica() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Planta> getPlanta() {
		return planta;
	}
	public void setPlanta(List<Planta> planta) {
		this.planta = planta;
	}
	
	@Override
	public String toString() {
		return "Fabrica [nombre=" + nombre + ", planta=" + planta + "]";
	}
	
	
	
	

}
