package area_circulo;

public class Circulo {
	
	private double radio = 1.0;
	
	;
	
	public Circulo () {
		radio = 1.0;
	}
	
	public Circulo (double radio) {
		
		this.radio = radio;
		
		
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio=radio;
	}
	
	public double getArea() {
		double area = Math.PI*Math.pow(radio, 2);
		return area;
	}
	
	public double getCircumference() {
		double circumference = 2 * Math.PI * radio;
		return circumference;
		
	}
	@Override
	
	public String toString () {
		
		return "Mi circulo tiene un radio de : " + radio + " ";		
		
	}
	
	
	
	
	
	
	

}
