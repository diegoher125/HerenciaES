package main.java.ieseuropa;

public class Senior extends Empleado {
	
	public Senior(String nombre) {
		super(2000, nombre);
	}
	
	@Override
	public String reuniones() {
		return "Los senior no pueden ir a las reuniones";
	}
	
	@Override
	public String trabajar() {
		return "Te toca picar codigo";
	}
	
	@Override
	public float cobrar() {
		return getSueldo();
	}

}
