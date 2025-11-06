package studentsInformation;

public class studentsInformation {
	//Como coordinador académico de la Universidad Cooperativa,
	//quiero registrar alumnos con sus datos básicos (nombre y edad),
	//para poder gestionar la información de los estudiantes y validar que cumplen los requisitos de inscripción.

	private String name;
	private int age;
	
	public studentsInformation(String name, int age) {
        if (name == null || name.trim().isEmpty()) {
        		throw new IllegalArgumentException("Error: el nombre no puede estar vacío. ");
        }
        if (age <= 0 || age > 60 ) {
        		throw new IllegalArgumentException("Error: la edad no puede estar entre 1 y 60");
        }
		this.name = name;
        this.age = age;
    }
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//Es mayor de edad? 
	
	public boolean legalAge() {
		return age >= 18;
			
		}
	//Mostrar info
	
	public void showinfo() {
		System.out.println("Alumno: " + name + ", Edad: " + age);
		if (legalAge()) {
			System.out.println(name + " Es mayor de edad.");
		} else {
			System.out.println(name + " Es menor de edad.");
		}
	}
}
