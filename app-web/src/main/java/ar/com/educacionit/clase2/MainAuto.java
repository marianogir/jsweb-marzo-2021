package ar.com.educacionit.clase2;

public class MainAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//como instanciar un objeto de la calse auto
		
		Auto auto1 = new Auto();
		Auto auto3 = new Auto("renault","Duster","Rojo",270);
		Auto auto4 = new Auto("Peugeot","208","Negro",310,100);
		
		
		
		//ahora que esta vivo.
		auto1.encender();
		System.out.println("----------------------");
		auto1.informarEstado();
		System.out.println("----------------------");
		auto1.acelerar();
		System.out.println("----------------------");
		auto1.informarEstado();
		System.out.println("----------------------");
		auto3.encender();
		System.out.println("----------------------");
		auto3.informarEstado();
		System.out.println("----------------------");
		auto4.encender();
		auto4.acelerar();
		System.out.println("----------------------");
		auto4.informarEstado();
		
		
		
	}

}
