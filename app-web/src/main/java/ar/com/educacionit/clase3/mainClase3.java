package ar.com.educacionit.clase3;

import ar.com.educacionit.clase2.Auto;

public class mainClase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto auto3 = new Auto();
		
		auto3.setmarca("dodge");
		String marca = auto3.getMarca();
		
		auto3.encender();
		auto3.acelerar();
		auto3.informarEstado();
		
		
		

	}

}
