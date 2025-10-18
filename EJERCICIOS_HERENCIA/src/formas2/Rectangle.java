package formas2;

public class Rectangle extends Shape {
	
	private double width;
	private double lenght;
	public Rectangle() {
		super();
		width = 1;
		lenght = 1;
	}
	public Rectangle(double width, double lenght) {
		super();
		this.width = width;
		this.lenght = lenght;
	}
	public Rectangle(double width, double lenght, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.lenght = lenght;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	public double getArea() {
		double area = 1;
		area = this.lenght*this.width;
		return area;
	}
	public double getPerimeter() {
		double perimeter = 1;
		perimeter = 2*(this.lenght+this.width);
		return perimeter;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", lenght=" + lenght + "]";
	}
	
	
	
	
	
	
	

}
