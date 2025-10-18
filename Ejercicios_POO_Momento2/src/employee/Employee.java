package employee;

public class Employee {
    
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    // Constructor parametrizado
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Métodos getters
    public int getID() {
        return id;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getName() {
        return "El nombre del empleado es: " + firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }
    
    // Setter para el salario
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    // Método para obtener el salario anual
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Método para aumentar el salario según un porcentaje
    public int raiseSalary(int percent) {
        // Aseguramos que el cálculo de porcentaje se haga en tipo double para mantener precisión
        double increase = (percent / 100.0) * salary;
        this.salary += increase;
        return this.salary;
    }
    
    public double increase (int percent) {
    	
    	double increase2 = ((percent/100) * salary);
    	return increase2;
    	
    }

    // Sobrescribimos el método toString() para representar el objeto de forma más legible
    @Override
    public String toString() {
        return "El id, nombre y salario del empleado es: " + id + " " + firstName + " " + lastName + " " + salary;
    }
}
