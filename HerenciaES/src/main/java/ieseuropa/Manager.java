package main.java.ieseuropa;

public class Manager extends Empleado {
	
	private boolean bonus;
	
	public Manager(String nombre) {
		super(2500, nombre);
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
		if(bonus) {
			return getSueldo() * 1.05f;
		}else {
			return getSueldo();
		}
	}

}
