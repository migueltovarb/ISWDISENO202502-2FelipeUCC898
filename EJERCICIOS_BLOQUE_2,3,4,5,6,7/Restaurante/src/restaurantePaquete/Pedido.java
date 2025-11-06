package restaurantePaquete;

import java.util.List;

public class Pedido {
	
	private List<Plato> platos;
	private Cliente cliente;
	
	public Pedido() {
		
	}
	
	public Pedido(List<Plato> platos, Cliente cliente) {
		super();
		this.platos = platos;
		this.cliente = cliente;
	}

	public List<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void registrar() {
		System.out.println("Pedido registrado con exito. ");
	}
	
	public double calcularTotal() {
		double acumular = 0;
		for (Plato p: platos) {
			acumular += p.getPrecio(); 
		}
		return acumular;
	}
	
	public void mostrarResumen () {
		System.out.println("==Acontinuacion el resumen del pedido==");
		for (Plato p: platos) {
			
			System.out.println(p);
			
		}
		
		System.out.println("El total del pedido es: " + calcularTotal());
	}

	@Override
	public String toString() {
		return "Pedido [platos=" + platos + "]";
	}
	
	
	
	
	
	
	

}
