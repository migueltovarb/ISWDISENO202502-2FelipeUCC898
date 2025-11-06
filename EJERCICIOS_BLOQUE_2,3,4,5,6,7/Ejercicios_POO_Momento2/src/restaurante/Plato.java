package restaurante;

public class Plato {
	
	private String nombre;
	private Tipo tipo;
	private float precio;
	
	public Plato(String nombre, Tipo tipo, float precio) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + "]";
	} 
	
	
	
}
