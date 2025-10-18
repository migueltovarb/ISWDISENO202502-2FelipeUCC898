package formas;

public class Cylinder extends Circle{
	
	private double height;

	public Cylinder() {
		super();
		height = 1;
	}

	public Cylinder(double radius) {
		super(radius);
	}

	public Cylinder(double height, double radius) {
		super(radius);
		this.height = height;
		
	}

	public Cylinder(double height, double radius, String color) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume () {
		return getArea() * height;
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + "]";
	}
	
	
	
	
	
	
	

}
