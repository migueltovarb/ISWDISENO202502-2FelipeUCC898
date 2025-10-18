package restaurantePaquete;

public class Plato {
	
	private String nombre;
	private TipoPlato tipo;
	private double precio;
	
	public Plato() {
		
	}
	
	public Plato(String nombre, TipoPlato tipo, double precio) {
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
	public TipoPlato getTipo() {
		return tipo;
	}
	public void setTipo(TipoPlato tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void registrar () {
		System.out.println("Plato registrado con exito. ");
	}
	
	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + "]";
	}
	
	

}
