package formas2;

public class Circle extends Shape{
	
	private double radius;

	public Circle() {
		super();
		radius = 1;
	}
	
	public Circle (double radius) {
		
		super();
		this.radius = radius;
		
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea () {
		double area = 1;
		area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 1;
		perimeter = Math.PI*this.radius*2;
		return perimeter;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
	
	

}
