package studentsInformation;

import java.util.ArrayList;

public class mainStudent {
	public static void main(String [] args) {
		ArrayList<studentsInformation> students = new ArrayList<> ();
		
		students.add(new studentsInforma,tion("Felipe", 17));
        students.add(new studentsInformation("Ana", 20));
        students.add(new studentsInformation("Carlos", 22));	
        
        //recorremos la lista 
        
        for (studentsInformation a : students) {
        		a.showinfo();
        }
	}

}
