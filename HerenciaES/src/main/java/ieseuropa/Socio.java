package main.java.ieseuropa;

public class Socio extends EmpleadoBonus {
	
	public Socio(String nombre) {
		super(3000, nombre);
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
		return "Tu estas de copas en el bar";
	}
	
	@Override
	public float cobrar() {
		if(isBonus()) {
			return getSueldo() * 1.1f;
		}else {
			return getSueldo();
		}
	}

}
