package juego.random;

import juego.component.gestos.*;
import juego.component.*;

public class Random {
	public static int getRandom(int max) {
		return (int) (Math.random() * max) + 1;
	}

	public static Gesto gestoRandom() {

		switch (getRandom(3)) {
		case 1:
			return new Piedra();
		case 2:
			return new Papel();
		case 3:
			return new Tijera();

		}
		return null;
	}
}
