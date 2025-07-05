/**
 * Class Documental
 */
package uni1a;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
	private String tema;
	private Investigador investigador;

	public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
		super(titulo, duracionEnMinutos, genero);
		this.tema = tema;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}

	public void mostrarInvestigador() {
		if (investigador != null) {
			investigador.mostrarDetalles();
		} else {
			System.out.println("No hay investigador asignado.");
		}
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del Documental");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		System.out.println("Tema: " + this.tema);
		mostrarInvestigador();
		System.out.println();
	}
}