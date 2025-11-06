package persona;

import java.util.Random;

public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	private static final char HOMBRE = 'H';
	private static final char MUJER = 'M';
	private static final int INFRAPESO = -1;
	private static final int PESO_TOTAL = 0;
	private static final int SOBREPESO = 1;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getDNI() {
		return dni;
	}
	public Persona() {
	    this.nombre = "";
	    this.edad = 0;
	    this.sexo = HOMBRE;
	    this.peso = 0.0;
	    this.altura = 0.0;
	    generarDNI();
	}

	public Persona(String nombre, int edad, char sexo) {
	    this.nombre = nombre;
	    this.edad = edad;
	    comprobarSexo(sexo);
	    this.peso = 0.0;
	    this.altura = 0.0;
	    generarDNI();
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
	    this.nombre = nombre;
	    this.edad = edad;
	    comprobarSexo(sexo);
	    this.peso = peso;
	    this.altura = altura;
	}
	
	public int calcularIMC() {
	    double IMC = this.peso / Math.pow(altura, 2);

	    if (IMC < 20) {
	        return INFRAPESO;
	    } else if (IMC >= 20 && IMC <= 25) {
	        return PESO_TOTAL;
	    } else {
	        return SOBREPESO;
	    }
	}
	
	public boolean esMayorDeEdad() {
		boolean mayor = true;
		
		if (this.edad < 18) {
			mayor = false;
		}
		
		return mayor;
	}
	
	
	public void comprobarSexo(char sexo) {
		
		if (sexo == HOMBRE || sexo == MUJER) {
			this.sexo = sexo;
		} else {
			this.sexo = HOMBRE;
		}
	}
	
	private void generarDNI () {
		Random rand = new Random ();
		int numero = 10000000 + rand.nextInt(90000000 );
		char letra = calcularLetraDNI(numero);
		this.dni = String.valueOf(numero) + letra;
		
		
	}
	
	private char calcularLetraDNI(int numero ) {
		
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		return letras.charAt(numero % 23);
		
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	
	
}
