package juego.component.gestos;

import juego.component.Gesto;
import juego.component.Resultado;

public class Jugador {
	private Gesto gesto;
	private Resultado[] historial;

	public Gesto getGesto() {
		return gesto;
	}

	public void setGesto(Gesto gesto) {
		this.gesto = gesto;
	}

	public void setRondas(int rondas) {
		this.historial = new Resultado[rondas];
	}

	public void addResultado(Resultado resultado, int ronda) {
		this.historial[ronda] = resultado;
	}

}
