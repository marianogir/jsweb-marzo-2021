package ar.com.educacionit.clase3;

public class libro extends Articulo{

	// atributos propios
	private String isbn;
	private String editorial;
	
	
	public libro(String titulo, Float precio, String isbn, String editorial) {
		super(titulo, precio);
		inicializar(isbn, editorial);
		
	}
	public libro(String titulo, String autor, Float precio, String isbn, String editorial) {
		super(titulo, autor, precio);
		inicializar(isbn, editorial);
	}
	private void inicializar(String isbn, String editorial) {
		this.editorial = editorial;
		this.isbn = isbn;
	}
	// get/ set
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	//sobrescritura polimorfismo con redefinicion.
	public void display() {
		//mostrar lo que tiene el padre
		super.display();
		//mostrar lo que tiene el hijo
		System.err.println("I.s.b.n: "+ this.isbn );
		System.err.println("Editorial: "+ this.editorial);
		
		
		
	}

}
