package ar.com.educacionit.clase3;

public class Articulo {
	private String titulo;
	private String autor;
	private Float precio;
	
	public Articulo(String titulo, String autor, Float precio) {
		incializar(titulo, precio);
		this.autor = autor;
	}
	
	public Articulo(String titulo, Float precio) {
		incializar(titulo, precio);
	}
	private void incializar(String titulo, Float precio) {
		this.titulo = titulo;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public boolean tieneAutor() {
		return this.autor != null;
	}
	public void  display() {
		System.out.println("Titulo: "+ this.getTitulo());
		System.out.println("Autor: ");        
		if (this.tieneAutor()) {
			System.out.println(this.getAutor());
		}
		System.out.println("Precio: "+this.getPrecio());
		
	}
}
