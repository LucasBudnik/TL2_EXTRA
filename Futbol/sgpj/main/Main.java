package sgpj.main;

import sgpj.equipos.Equipo;
import sgpj.partido.Partido;

public class Main {

	
	public static void main(String[] args) {
		Equipo e1 = new Equipo();
		Equipo e2 = new Equipo();
		
		if(Partido.cumpleLaCantidadDeJugadores(e1) && Partido.cumplenPosiciones(e1)) {
			System.out.print("el equipo 1 cumple");
			if(Partido.cumpleLaCantidadDeJugadores(e2) && Partido.cumplenPosiciones(e2)) {
				System.out.println("ambos equipos Cumplen por lo tanto se puede jugar");
			}
			else
				System.out.println("El equipo 2 no cumple por lo tanto no se puede jugar");
		}
		
	}

}
