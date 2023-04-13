package main.java.ieseuropa;

public class Empleado {
	
	private float sueldo;
	private String nombre;
	
	public Empleado(float sueldo, String nombre) {
		this.sueldo = sueldo;
		this.nombre = nombre;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	public String reuniones() {
		return "";
	}
	
	public String trabajar() {
		return "";
	}
	
	public float cobrar() {
		return sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", nombre=" + nombre + "]";
	}

}
