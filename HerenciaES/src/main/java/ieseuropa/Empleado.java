package main.java.ieseuropa;

public class Empleado {
	
	private int sueldo;
	private String nombre;
	
	public Empleado(int sueldo, String nombre) {
		this.sueldo = sueldo;
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public String reuniones() {
		return "";
	}
	
	public String trabajar() {
		return "";
	}
	
	public float cobrar() {
		return 0;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", nombre=" + nombre + "]";
	}

}
