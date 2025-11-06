package poo_ejercicios;

public class circulo {
	
	private double radio = 1.0;
	
	
	public circulo () {
		radio = 0.1;
	}
	
	
	public circulo (double radio) {
		this.radio = 0.1;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio=radio;
	}
	
	public double getArea() {
		double area= Math.PI*Math.pow(radio, 2);
	}
	
	
	
}
