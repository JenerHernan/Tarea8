package Ejercicios;
import java.util.Random;

public class Password {
	private int longitud;
	public String contrasenya;
	
	public Password() {
		this.longitud = 8;
		this.contrasenya = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.crearContrasenya(longitud);
	}
	
	private void crearContrasenya(int s) {
		Random rand = new Random();
		String aux = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";
		this.contrasenya = "";
		for(int i = 0; i < s; i++)
			this.contrasenya += aux.charAt(rand.nextInt(aux.length()));
	}
	
	public static void main(String[] args) {
		Password pass = new Password(8);
		System.out.print(pass.contrasenya);
	}
}
