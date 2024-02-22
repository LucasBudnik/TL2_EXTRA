package gpt.random;

import gpt.components.figures.*;
import gpt.components.*;

public class Randomize {

	public static int getRandom(int max) {
		return (int) (Math.random() * (max)) + 1;
	}

	public static FiguraGeometrica getFigura() {
		int a = getRandom(3);
		int b = getRandom(100);
		switch (a) {
		case 1:
			return new Circulo((double) getRandom(b));
		case 2:
			return new Cuadrado((double) getRandom(b));
		case 3:
			Triangulo t;
			do {
				t = new Triangulo((double) getRandom(b), (double) getRandom(b), (double) getRandom(b));
			} while (!t.verify());
			return t;
		default:
			return null;
		}
	}
}
