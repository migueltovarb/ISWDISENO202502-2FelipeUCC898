package persona;

public class Progama {
	
	public static void main (String[] args) {
		
		Person myPerson = new Person("Juan", "San Vicente N 23-33 CL 10");
		System.out.println(myPerson);
		
		myPerson.setAddress("456 Oak aVE");
		System.out.println("Nuevo dirreccion de " + myPerson.getName() + ": " + myPerson.getAddress());
		System.out.println(myPerson);
		
		
		Student myStudent = new Student ("Ingenieria de Software", 323, 3232, "Juan Carlos Revelo" , "Santafe N 23-45 CL 90" );
		myStudent.setAddress("La cocha N 34 CL 34-23");
		myStudent.setName("Juan Andres");
		System.out.println(myPerson);
		
		Staff myStaff = new Staff("normal superior" , 2343, "Juan Carlo" , "SAN VICENTE N 34-35 CL 35" );
		myStaff.setAddress("Nueva Address");
		System.out.println(myStaff);
	
		
		
	}

}
