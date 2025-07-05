package uni1a;

public class Temporada {

	private int numero;
	private int totalEpisodios;

	public Temporada(int numero, int totalEpisodios) {
		this.numero = numero;
		this.totalEpisodios = totalEpisodios;
	}

	public int getNumero() {
		return numero;
	}

	public int getTotalEpisodios() {
		return totalEpisodios;
	}

	public String toString() {
		return "Temporada: " + numero + " Total: " + "(" + totalEpisodios + " episodios)";
	}
}