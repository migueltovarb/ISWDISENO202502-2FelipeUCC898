package restaurantePaquete;

import java.util.ArrayList;
import java.util.List;

public class Programa {
	
	public static void main (String [] args) {
		
		Cliente cliente = new Cliente("Felipe", "31234355665" );
		
		
		System.out.println(cliente);
		
		Plato polloAsado = new Plato("pollo Asado", TipoPlato.PLATOFUERTE , 30000 );
		Plato Cuy = new Plato("Cuy", TipoPlato.PLATOFUERTE , 70000 );
		Plato BandejaPaisa = new Plato("Bandeja Paisa", TipoPlato.PLATOFUERTE , 15000 );
		//Object miCliente = cliente;
		//miCliente = polloAsado;
		List<Plato> platosDelMenu = new ArrayList<Plato>();
		
		platosDelMenu.add(BandejaPaisa);
		platosDelMenu.add(Cuy);
		platosDelMenu.add(polloAsado);
		
		Menu miMenu = new Menu(platosDelMenu);
		
		System.out.println(miMenu);
		
		List<Plato> platosDelPedido = new ArrayList<Plato>();
		platosDelPedido.add(BandejaPaisa);
		platosDelPedido.add(Cuy);
		platosDelPedido.add(Cuy);
		
		Pedido miPedido = new Pedido(platosDelPedido, cliente);
		
		miPedido.mostrarResumen();
		
	}

}
