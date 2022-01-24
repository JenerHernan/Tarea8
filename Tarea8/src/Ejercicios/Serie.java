package Ejercicios;

public class Serie {

	private String titulo;
	private int n_temporadas;
	private Boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.n_temporadas = 3;
		this.entregado = false;
		this.titulo = "";
		this.creador = "";
		this.genero = "";
	}
	
	public Serie (String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.n_temporadas = 3;
		this.entregado = false;
		this.genero = "";
	}
	
	public Serie (String titulo, String creador, int n_temp, String genero) {
		this.titulo = titulo;
		this.creador = creador;
		this.n_temporadas = n_temp;
		this.entregado = false;
		this.genero = genero;
	}
	
	public static void main(String[] args) {
		

	}

}
