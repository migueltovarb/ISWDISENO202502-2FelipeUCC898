package formas;

public class Programa {
	
	public static void main (String [] args) {
		
		Circle myCircle = new Circle();
		
		double radius = 5;
		String color = "Rojo";
		
		myCircle.setRadius(radius);
		myCircle.setColor(color);
		
		System.out.println("==El area de tu Ciculo==");
		System.out.println(myCircle.getArea());
		System.out.println(myCircle.toString());
		
		Cylinder myCylinder = new Cylinder();
		
		double height = 1;
		
		myCylinder.setHeight(height);
		
		System.out.println("==EL volumen de tu Cilindro es==");
		
		System.out.println(myCylinder.getVolume());
		
	}

}
