package ar.com.educacionit.clase2;

public class Auto {
	//atributos
	private String marca;
	private String modelo;
	private String color;
	private int anio;
	private float velocidad;
	private float velocidadMaxima;
	private float combustible;
	private boolean encendido;
	
	//contructor por defecto
	
	public Auto(){
		encendido = false;
		combustible = 0;
		anio = 2021;
		velocidad = 0;
		velocidadMaxima = 250;
	}
	// constructor parametrizado
	public Auto(String marca,String modelo, String color, float velocidadMaxima){
		encendido = false;
		combustible = 0;
		anio = 2021;
		velocidad = 0;
		this.modelo =modelo;
		this.marca = marca;
		this.velocidadMaxima = velocidadMaxima;
		this.color = color;	
	}
	public Auto(String marca,String modelo, String color, float velocidadMaxima, float combustible){
		encendido = false;
		anio = 2021;
		velocidad = 0;
		this.modelo =modelo;
		this.marca = marca;
		this.velocidadMaxima = velocidadMaxima;
		this.color = color;	
		this.combustible = combustible;
	}
	//metodos
	public void encender() {
		if (!encendido ) {
			encendido = true;
			System.out.println("Se ha encendido el automovil");
		}else {
			System.out.println("auto ya esta encendido");
		}
	}
	
	public void apagar() {
		if (encendido) {
			encendido = false;
			System.out.println("Se ha apagado el automovil");
		}else {
			System.out.println("auto ya esta apagado");
		}
		
	}
	public void acelerar() {
		if (encendido) {
			if(velocidad < velocidadMaxima) {
				if (combustible > 0) {
					velocidad++;
					combustible--;
				}else {
					System.out.println("No hay mas combustible");
				}
			}else {
				System.out.println("Ha llegado a la velocidad maxima");
			}
		}
		
	}
	public float obtenerVelocidad() {
		return velocidad;
	}
	public void informarEstado() {
		System.out.println("Marca: "+ this.marca);
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Año: "+ this.anio);
		System.out.println("Color: "+ this.color);
		System.err.println("Encendido: "+ this.encendido);
		System.out.println("Velocidad: "+ this.velocidad);
		System.out.println("Velocidad Maxima: "+ this.velocidadMaxima);
		System.out.println("Combustible: "+ this.combustible);
		
	}
	public void setmarca(String nuevaMarca) {
		if (marca == null) {
			this.marca = nuevaMarca.toUpperCase();
		}else {
			System.out.println("marca no puede ser null");
		}
		
	}
	public String getMarca() {
		return this.marca;
	}
}
