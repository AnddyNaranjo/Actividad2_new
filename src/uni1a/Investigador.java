package uni1a;

public class Investigador {

	private String nombre;
	private String especialidad;

	public Investigador(String nombre, String especialidad) {
		this.nombre = nombre;
		this.especialidad = especialidad;

	}

	public String getNombre() {
		return nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void mostrarDetalles() {

		System.out.println("Investigador: " + nombre + " La especialidad es: " + especialidad);
	}

}