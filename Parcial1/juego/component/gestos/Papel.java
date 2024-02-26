package juego.component.gestos;

import juego.component.Gesto;
import juego.component.Resultado;

public class Papel extends Gesto {
	public Resultado compararCon(Gesto gesto) {
		return gesto.compararConPapel();
	}

	public Resultado compararConPiedra() {
		return Resultado.GANA;
	}

	public Resultado compararConPapel() {
		return Resultado.EMPATA;
	}

	public Resultado compararConTijera() {
		return Resultado.PIERDE;
	}
}
