package ar.com.educacionit.clase3;

import javax.sound.midi.SysexMessage;

public class Pasatiempo extends Articulo {

	private String marca;
	private String codigo;
	
	public Pasatiempo(String titulo, Float precio, String marca, String codigo) {
		super(titulo, precio);
		inicializar(marca, codigo);
	}
	public Pasatiempo(String titulo, String autor, Float precio, String marca, String codigo) {
		super(titulo, autor, precio);
		inicializar(marca, codigo);
	}
	
	
	private void inicializar(String marca, String codigo) {
		this.marca = marca;
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public void display() {
		super.display();
		System.err.println("marca: "+ this.marca);
		System.err.println("codigo: "+ this.codigo);
		
	}
	
	
	

	
}
