package restaurante;

import java.util.List;

public class Cliente {
	private String nombre;
	private int numeroContacto;
	private List<Pedido> pedidos;
	
	public Cliente(String nombre, int numeroContacto) {
		this.nombre = nombre;
		this.numeroContacto = numeroContacto;
	}
	
	public Cliente(String nombre, int numeroContacto, List<Pedido> pedidos) {
		super();
		this.nombre = nombre;
		this.numeroContacto = numeroContacto;
		this.pedidos = pedidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroContacto() {
		return numeroContacto;
	}
	public void setNumeroContacto(int numeroContacto) {
		this.numeroContacto = numeroContacto;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public Pedido hacerPedido(List<Plato> platos, int cantidad) {
	    Pedido pedido = new Pedido(this); // `this` es el cliente actual
	    pedido.setPlatos(platos);
	    pedido.setCantidad(cantidad);

	    if (this.pedidos != null) {
	        this.pedidos.add(pedido); // guarda el pedido en la lista del cliente
	    }

	    return pedido;
	}
	
	

}
