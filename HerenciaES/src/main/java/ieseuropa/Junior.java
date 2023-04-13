package main.java.ieseuropa;

public class Junior extends Empleado{
	
	public Junior(String nombre) {
		super(1000, nombre);
	}
	
	@Override
	public String reuniones() {
		return "Los junior no pueden ir a las reuniones";
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
