package gpt.components;

import gpt.components.figures.*;

public final class Area {
	private static Area INSTANCE;

	private Area() {
	}

	public static Area getArea() {
		if (INSTANCE == null)
			INSTANCE = new Area();
		return INSTANCE;
	}

	public static double calcularArea(Object o) {
		if (o instanceof Cuadrado) {
			Cuadrado c = (Cuadrado) o;
			return (c.getLado() * c.getLado());
		} else if (o instanceof Circulo) {
			Circulo d = (Circulo) o;
			return (3.14 * d.getRadio() * d.getRadio());
		} else {
			if (o instanceof Triangulo) {
				Triangulo t = (Triangulo) o;
				double s = (t.calcularPerimetro() / 2);
				System.out.println("a " + t.getL1() + " b " + t.getL2() + " c " + t.getL3());
				// return s;
				return Math.sqrt(s * (s - t.getL1()) * (s - t.getL2()) * (s - t.getL3()));
			}
		}
		return 0.0;
	}
}
/*

*/