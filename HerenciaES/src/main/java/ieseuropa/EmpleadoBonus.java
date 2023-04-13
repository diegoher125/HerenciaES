package main.java.ieseuropa;

public class EmpleadoBonus extends Empleado {
	
private boolean bonus;
	
	public EmpleadoBonus(int sueldo, String nombre) {
		super(sueldo, nombre);
		this.bonus = false;
	}
	
	public boolean isBonus() {
		return bonus;
	}

	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}
	
	public void objetivosCumplidos() {
		this.bonus = true;
	}

}
