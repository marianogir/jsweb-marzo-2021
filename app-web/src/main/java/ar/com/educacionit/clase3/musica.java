package ar.com.educacionit.clase3;

import java.util.Arrays;

public class musica extends Articulo {

	private String sello;
	private String[] temas;
	
	public musica(String titulo,  Float precio, String sello, String[] temas) {
		super(titulo, precio);
		inicializar(sello, temas);
	
	}
	
	
	public musica(String titulo, String autor, Float precio, String sello, String[] temas) {
		super(titulo, autor, precio);
		inicializar(sello, temas);
	}
	private void inicializar(String sello, String[] temas) {
		this.sello = sello;
		this.temas = temas;
	}


	public String getSello() {
		return sello;
	}


	public void setSello(String sello) {
		this.sello = sello;
	}


	public String[] getTemas() {
		return temas;
	}


	public void setTemas(String[] temas) {
		this.temas = temas;
	}
	@Override
	public void display() {
		super.display();
		System.err.println("sello: "+ this.sello);
		System.err.println("temas: "+ Arrays.toString(this.temas));
	}
}
