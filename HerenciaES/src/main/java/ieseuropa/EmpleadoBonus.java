package main.java.ieseuropa;

public class EmpleadoBonus extends Empleado {
	
	private boolean cumple;
	private int bonus;
	
	public EmpleadoBonus(int sueldo, String nombre, int bonus) {
		super(sueldo, nombre);
		this.cumple = false;
	}
	
	public void objetivosCumplidos() {
		this.cumple = true;
	}

}
