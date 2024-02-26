package juego.component.gestos;

import juego.component.Gesto;
import juego.component.Resultado;

public class Piedra extends Gesto {
	public Resultado compararCon(Gesto gesto) {
		return gesto.compararConPiedra();
	}

	public Resultado compararConPiedra() {
		return Resultado.EMPATA;
	}

	public Resultado compararConPapel() {
		return Resultado.PIERDE;
	}

	public Resultado compararConTijera() {
		return Resultado.GANA;
	}
}

