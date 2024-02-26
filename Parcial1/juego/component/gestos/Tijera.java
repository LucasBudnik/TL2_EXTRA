package juego.component.gestos;

import juego.component.Gesto;
import juego.component.Resultado;

public class Tijera extends Gesto {
	public Resultado compararCon(Gesto gesto) {
		return gesto.compararConTijera();
	}

	public Resultado compararConPiedra() {
		return Resultado.PIERDE;
	}

	public Resultado compararConPapel() {
		return Resultado.GANA;
	}

	public Resultado compararConTijera() {
		return Resultado.EMPATA;
	}
}
