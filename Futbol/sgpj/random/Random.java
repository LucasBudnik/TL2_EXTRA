package sgpj.random;

import sgpj.posiciones.*;

public class Random {
	public static int getRandom(int rango) {
		return (int) (Math.random() * rango) + 1;
	}

	public static Posicion getPosicionRandom() {
		int n = getRandom(4);
		switch (n) {
		case 1:
			return Posicion.ARQUERO;
		case 2:
			return Posicion.DEFENSOR;
		case 3:
			return Posicion.MEDIOCAMPO;
		case 4:
			return Posicion.DELANTERO;
		}
		return null;
	}
}
