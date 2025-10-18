package restaurante;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private List<Plato> platos;
	private int cantidad;
	private Cliente cliente;
	

	
	public Pedido(Cliente cliente) {
		super();
		this.platos = new ArrayList<>();
		this.cantidad = 1;
		this.cliente = cliente;
	}
	
	public List<Plato> getPlatos() {
		return platos;
	}
	
	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double calcularTotal () {
		double total = 0;
		for (Plato p : platos) {
			total += p.getPrecio() * cantidad;
		}
		
		return total;
		
	}
	
	public String mostrarCuenta() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("=== Pedido de ").append(cliente.getNombre()).append(" ===\n");
	    double total = 0;
	    for (Plato p : platos) {
	        double subtotal = p.getPrecio() * cantidad;
	        sb.append("Plato: ").append(p.getNombre())
	          .append(" | Precio: $").append(p.getPrecio())
	          .append(" | Cantidad: ").append(cantidad)
	          .append(" | Subtotal: $").append(subtotal).append("\n");
	        total += subtotal;
	    }
	    sb.append("TOTAL A PAGAR: $").append(total).append("\n");
	    sb.append("===========================\n");
	    return sb.toString();
	}



	
}
