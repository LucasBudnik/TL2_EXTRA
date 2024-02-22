package gpt.main;

import gpt.components.*;
import gpt.random.*;

public class Main {

	public static void main(String[] args) {
		int n = (int) Randomize.getRandom(20);
		FiguraGeometrica[] f = new FiguraGeometrica[n];
		for (int i = 0; i < n; i++) {
			f[i] = Randomize.getFigura();
		}
		for (int i = 0; i < n; i++) {
			System.out.println("--------------------");
			System.out.println(f[i].toString());
			System.out.println("area " + f[i].calcularArea());
			System.out.println("perimetro " + f[i].calcularPerimetro());
		}

	}

}
