package ar.com.educacionit.clase3;

public class Buscador {
	//atributos
	private String claveBusqueda;
	private Integer cantidadResultados;
	private Articulo[] resultados;
	
	//constructor
	
	public Buscador() {
		this.resultados = new Articulo[0];
		this.cantidadResultados = 0;
		this.claveBusqueda = "";
		
		
	}
	public  void buscar() {
		// select * from articulos where titulo like '%this.claveBusqueda%
		Articulo[] resultados = new Articulo[] {
				new libro ("TONY STAR IRON MAN 01: UN...", "scott dan", 830f,"345543","perfil" ),
				new libro ("INVENCIBLE IRON MAN, EL ...", "bendis bryan", 1525f, "23443543", "ovni press"),
				new Pasatiempo ("IRON MAN 15 CENTIMETROS -",117f, "hasbro","55757575757" ),
				new musica ("INVENCIBLE IRON MAN 2 MA...","bendis, bryan michael",1125f, "sony music",
						new String[] {
								"1-SHOOT OT THRILL\n",
								"2-ROCK N ROLL DAMNATION\n",
								"3-GUNS FOR HIRE\n",
								"4-COLD HEARTED MAN\n",
								"5-BACK IN BLACK\n",
								"6-THUNDERSTRUCK"
						}),
				new pelicula ("iron man 4", 850f, "disney pixar", "apta todo publico")
		};
		this.resultados = resultados;
		this.cantidadResultados = resultados.length;
	}
	public String getClaveBusqueda() {
		return this.claveBusqueda;
		
	}
	public void setClaveBusqueda (String claveBuscada) {
		this.claveBusqueda = claveBuscada.toUpperCase();
		
	}
	public Integer getCantidadResultados() {
		return this.resultados.length;
	}
	
	public Articulo[] getResultados() {
		return this.resultados;
	
	}
	public boolean hayResultados() {
		return this.cantidadResultados>0;
		
	}
}
