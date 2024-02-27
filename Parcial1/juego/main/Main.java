package juego.main;

import juego.random.*;

public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Random.getRandom(3));
		}
	}
}
