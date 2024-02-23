package sgpj.main;

import sgpj.equipos.*;
import sgpj.partido.Partido;
import sgpj.random.Random;

public class Main {

	public static void main(String[] args) {
		/* creamos 2 equipos */
		Equipo e1 = new Equipo();
		Equipo e2 = new Equipo();
		for (int i = 0; i < 5; i++) {
			e1.agregarJugador(new Jugador(Random.getPosicionRandom(), Random.getPosicionRandom()));
			e2.agregarJugador(new Jugador(Random.getPosicionRandom(), Random.getPosicionRandom()));
		}
		boolean n = true;
		if (Partido.cumpleLaCantidadDeJugadores(e1)) {
			System.out.print("cj1 cumple");
			if (Partido.cumplenPosiciones(e1)) {
				System.out.println("p1 cumple");
				n = true;
			} else {
				n = false;
				System.out.println("no cumple");
			}
		} else
			n = false;
		if (Partido.cumpleLaCantidadDeJugadores(e2)) {
			System.out.print("cj2 cumple");
			if (Partido.cumplenPosiciones(e2)) {
				System.out.println("p2 cumple");
			} else {
				n = false;
				System.out.println("e2 no cumple");
			}
		} else {
			System.out.println("e2 no cumple");
			n = false;
		}

		if (n)
			System.out.println("-------------------\n se puede jugar el partido");
	}

}
