package ar.com.educacionit.clase3;

public class pelicula extends Articulo {

	private String productora;
	private String clasificacion;
	
	public pelicula(String titulo, String autor, Float precio, String productora, String clasificacion) {
		super(titulo, autor, precio);
		inicializar(productora, clasificacion);
	}
	public pelicula(String titulo,  Float precio, String productora, String clasificacion) {
		super(titulo, precio);
		inicializar(productora, clasificacion);
	}
	
	private void inicializar(String productora, String clasificacion) {
		this.productora = productora;
		this.clasificacion = clasificacion;
	}
	
	public String getProductora() {
		return productora;
	}
	public void setProductora(String productora) {
		this.productora = productora;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	@Override
	public void display() {
		super.display();
		System.err.println("productora: "+ this.productora);
		System.err.println("clasificacion: "+ this.clasificacion);
	}

}
