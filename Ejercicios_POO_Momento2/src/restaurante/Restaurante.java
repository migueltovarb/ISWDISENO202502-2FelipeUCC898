package restaurante;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
	
	private String nombre;
	private List<Pedido> pedidos;
	private List<Cliente> clientes;
	private List<Plato> menu = new ArrayList<>();
	
	
	public Restaurante() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public List<Plato> getMenu() {
		return menu;
	}
	public void setMenu(List<Plato> menu) {
		this.menu = menu;
	}
	
	public void registrarPlatos(String nombre, Tipo tipo, float precio) {
		
		Plato plato = new Plato(nombre, tipo, precio);
		menu.add(plato);
		
		
	}
	
	public void registrarClientes(String nombre, int numeroContacto) {
		
		Cliente cliente = new Cliente(nombre, numeroContacto);
		
		clientes.add(cliente);
		
	}
	@Override
	public String toString() {
		return "Restaurante [nombre=" + nombre + ", pedidos=" + pedidos + ", clientes=" + clientes + ", menu=" + menu
				+ "]";
	}
	
	
	
	
	
	
	
	
}
