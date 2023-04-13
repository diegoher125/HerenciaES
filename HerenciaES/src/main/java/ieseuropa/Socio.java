package main.java.ieseuropa;

public class Socio extends Empleado {
	
	private boolean bonus;
	
	public Socio(String nombre) {
		super(3000, nombre);
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
		return "Tu estas de copas en el bar";
	}
	
	@Override
	public float cobrar() {
		if(bonus) {
			return getSueldo() * 1.1f;
		}else {
			return getSueldo();
		}
	}

}
