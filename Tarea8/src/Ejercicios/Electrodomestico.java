package Ejercicios;

public class Electrodomestico {

	private double precio_base;
	private String color;
	private char consumo_energetico;
	private double peso;
	
	public Electrodomestico() {
		this.color = "blanco";
		this.consumo_energetico = 'F';
		this.precio_base = 100;
		this.peso = 5;
	}
	
	public Electrodomestico(double peso, double precio) {
		this.peso = peso;
		this.precio_base = precio;
		this.color = "blanco";
		this.consumo_energetico = 'F';
	}
	
	public Electrodomestico(double peso, double precio,String color, char consumo) {
		this.peso = peso;
		this.precio_base = precio;
		this.color = color.toLowerCase();
		this.consumo_energetico = consumo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
