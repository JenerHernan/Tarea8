package Ejercicios;

public class Persona {

	private String nombre;
	private int edad;
	private String DNI;
	private char genero;
	private double peso;
	private double altura;
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.DNI = "";
		this.genero = 'H';
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, char genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.DNI = "";
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, char genero, String DNI, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.DNI = DNI;
		this.peso = peso;
		this.altura = altura;
	}
}
