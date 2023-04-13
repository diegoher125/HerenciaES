package main.java.ieseuropa;

public class Manager extends EmpleadoBonus {
	
	public Manager(String nombre) {
		super(2500, nombre);
	}
	
	public void objetivosCumplidos() {
		setBonus(true);
	}

	@Override
	public String reuniones() {
		return "Tienes reunion";
	}
	
	@Override
	public String trabajar() {
		return "Te tocan planificaciones";
	}
	
	@Override
	public float cobrar() {
		if(isBonus()) {
			return getSueldo() * 1.05f;
		}else {
			return getSueldo();
		}
	}

}
