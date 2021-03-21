package ar.com.educacionit.clase3;

public class casteoObjetosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Articulo articulo = new libro ("TONY STAR IRON MAN 01: UN...", "scott dan", 830f,"345543","perfil");
		articulo.getAutor()	;
		articulo.getTitulo();
		articulo.getPrecio();
		
		libro libroAux = (libro)articulo;
		libroAux.getIsbn();
		libroAux.getEditorial();
		
		articulo = (Articulo)libroAux;
		System.out.println("fin");
		
		
		
	

	}

}
