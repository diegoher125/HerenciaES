package main.java.ieseuropa;

public class Manager extends EmpleadoBonus {
	
	public Manager(String nombre) {
		super(2500, nombre,5);
	}

	@Override
	public String reuniones() {
		return "Tienes reunion";
	}
	
	@Override
	public String trabajar() {
		return "Te tocan planificaciones";
	}
	

}
