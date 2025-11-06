package tallerVehiculos;

import java.util.List;

public class Vehiculo {
	
	private String marca;
	private String placa;
	private String modelo;
	private Propietario propietario;
	private List<Servicio> servicios;
	public Vehiculo() {
		super();
	}
	public Vehiculo(String marca, String placa, String modelo, Propietario propietario, List<Servicio> servicios) {
		super();
		this.marca = marca;
		this.placa = placa;
		this.modelo = modelo;
		this.propietario = propietario;
		this.servicios = servicios;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa, Taller taller) {
		
		if (!placa.matches("^[A-Za-z]{4}{0-9}{2}$")) {
			System.out.println("Error: la placa debe tener 6 caracteres - 4 letras seguidas de dos numeros");
			return;
		}
		
		for(Vehiculo v: taller.getVehiculos()) {
			if (v.getPlaca().equalsIgnoreCase(placa)) {
				System.out.println("Error: la placa ya existe.");
				return;
			}
		}
		
		
		
		this.placa = placa.toUpperCase();
		System.out.println("Vehiculo registrado con placa: " + this.placa);
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public List<Servicio> getServicios() {
		return servicios;
	}
	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
	
	private void registrar() {
		System.out.println("Vehiculo registrado con exito.");
	}
	
	private double totalGastado() {
		double total =0;
		
		for (Servicio s: servicios) {
			total += s.getCosto();
		}
		
		return total;
		
	}
	
	private String mostrarHistoria() {
		System.out.println("==Historial de servicios del vehiculo==");
		
		for(Servicio s: servicios) {
			System.out.println(s);
			
		}
		
		return "El total gastado es: " + totalGastado();
		
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", placa=" + placa + ", modelo=" + modelo + ", servicios=" + servicios
				+ "]";
	}
	
	
}
