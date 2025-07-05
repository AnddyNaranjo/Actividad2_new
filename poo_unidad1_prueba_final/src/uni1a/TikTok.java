/**
 * Class SerieDeTV
 */
package uni1a;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class TikTok extends ContenidoAudiovisual {
	private int partes;

	public TikTok(String titulo, int duracionEnMinutos, String genero, int partes) {
		super(titulo, duracionEnMinutos, genero);
		this.partes = partes;
	}

	public int getPartes() {
		return partes;
	}

	public void setPartes(int partes) {
		this.partes = partes;
	}

	public void mostrarPartes() {
		if (partes == 0) {
			System.out.println("No hay mas partes.");
		} else {
			System.out.println("Tiene: " + this.partes + " partes");
		}
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles de los Video de Tiktok:");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		mostrarPartes();
		System.out.println();
	}
}