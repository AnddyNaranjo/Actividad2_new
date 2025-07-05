package poo;

import java.io.Console;

import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
		System.out.println("Hello from Eclipse!");

		// Crear instancias de las subclases
		ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

		Pelicula avatar = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
		avatar.agregarActor(new Actor("Dicaprio ", 45));

		SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy");
		serie.agregarTemporada(new Temporada(1, 7));
		serie.agregarTemporada(new Temporada(2, 10));
		serie.agregarTemporada(new Temporada(3, 9));

		Documental documental = new Documental("Cosmos", 45, "Science", "Astronomy");
		documental.setInvestigador(new Investigador("Carl Sagan", "Astronomía"));

		TikTok tiktok = new TikTok("K.3RVO", 7, "Manga/Anime", 10);

		AudioLibros audioLibros = new AudioLibros("Caperucita Roja", 30, "Cuento de Hadas",
				"El peligro de confiar en desconocidos");

		contenidos[0] = avatar;
		contenidos[1] = serie;
		contenidos[2] = documental;
		contenidos[3] = audioLibros;
		contenidos[4] = tiktok;

		// Mostrar los detalles de cada contenido audiovisual
		for (ContenidoAudiovisual contenido : contenidos) {
			contenido.mostrarDetalles();
		}
	}
}