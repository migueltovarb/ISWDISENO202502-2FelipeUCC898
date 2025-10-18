package formas;

public class Circle {
	
	private double radius;
	private String color;
	public Circle() {
		super();
		radius = 1;
		color = "Red";
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		double area = 0;
		area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
	

}
