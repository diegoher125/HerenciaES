package main.java.ieseuropa;

public class EmpleadoBonus extends Empleado {
	
	private boolean cumple;
	private int bonus;
	
	public EmpleadoBonus(int sueldo, String nombre, int bonus) {
		super(sueldo, nombre);
		this.cumple = false;
		this.bonus = bonus;
	}
	
	public void objetivosCumplidos() {
		this.cumple = true;
	}
	
	@Override
	public float cobrar() {
		if(cumple) {
			return getSueldo() * 1.1f;
		}else {
			return getSueldo();
		}
	}

}
