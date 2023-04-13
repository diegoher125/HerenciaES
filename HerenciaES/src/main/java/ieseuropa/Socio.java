package main.java.ieseuropa;

public class Socio extends EmpleadoBonus {
	
	public Socio(String nombre) {
		super(3000, nombre, 10);
	}

	@Override
	public String reuniones() {
		return "Tienes reunion";
	}
	
	@Override
	public String trabajar() {
		return "Tu estas de copas en el bar";
	}
	
	

}
