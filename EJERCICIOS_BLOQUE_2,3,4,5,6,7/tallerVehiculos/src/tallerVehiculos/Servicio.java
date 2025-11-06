package tallerVehiculos;

public class Servicio {
	
	private TipoServicio tipo;
	private double costo;
	private String fecha;
	private Vehiculo vehiculo;
	
	public Servicio(TipoServicio tipo, double costo, String fecha, Vehiculo vehiculo) {
		super();
		this.tipo = tipo;
		this.costo = costo;
		this.fecha = fecha;
		this.vehiculo = vehiculo;
	}
	public TipoServicio getTipo() {
		return tipo;
	}
	public void setTipo(TipoServicio tipo) {
		this.tipo = tipo;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		if (costo <= 0) {
			
			System.out.println("Error, valor ingresado incorrecto.");
			
		} else {
			this.costo = costo;
		}
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public void registrar() {
		System.out.println("Servicio registrado con exito.");
		
	}
	@Override
	public String toString() {
		return "Servicio [tipo=" + tipo + ", costo=" + costo + ", fecha=" + fecha + "]";
	}
	
	
	
	
}
