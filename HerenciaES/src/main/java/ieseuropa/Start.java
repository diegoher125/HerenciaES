package main.java.ieseuropa;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Junior junior = new Junior("");
		Senior senior = new Senior("");
		Manager manager = new Manager("");
		Socio socio = new Socio("");
		
		System.out.println(junior.reuniones());
		System.out.println(junior.trabajar());
		System.out.println(junior.cobrar() + "€");
		
		System.out.println(senior.reuniones());
		System.out.println(senior.trabajar());
		System.out.println(senior.cobrar() + "€");
		
		System.out.println(manager.reuniones());
		System.out.println(manager.trabajar());
		System.out.println(manager.cobrar() + "€");
		manager.objetivosCumplidos();
		System.out.println(manager.cobrar() + "€");
		
		System.out.println(socio.reuniones());
		System.out.println(socio.trabajar());
		System.out.println(socio.cobrar() + "€");
		socio.objetivosCumplidos();
		System.out.println(socio.cobrar() + "€");
	}

}
