/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
	private int temporadas;
	private List<Temporada> temporadaList = new ArrayList<>();

	public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
		super(titulo, duracionEnMinutos, genero);

	}

	public void agregarTemporada(Temporada temporada) {
		temporadaList.add(temporada);
	}

	public void mostrarTemporadas() {
		System.out.println("Temporadas: ");
		for (Temporada temporada : temporadaList) {
			System.out.println(" - " + temporada);
		}
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles de la Serie de TV:");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		mostrarTemporadas();
		System.out.println();
	}
}