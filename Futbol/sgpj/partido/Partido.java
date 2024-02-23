package sgpj.partido;

import java.util.Arrays;

import sgpj.equipos.Equipo;
import sgpj.equipos.Jugador;
import sgpj.posiciones.Posicion;

public class Partido {
	public static boolean cumpleLaCantidadDeJugadores(Equipo e) {
		return e.calcularJugadore() >= 5;
	}

	public static boolean cumplenPosiciones(Equipo e) {
		Posicion p;
		Posicion[] pos = { Posicion.ARQUERO, Posicion.DEFENSOR, Posicion.DEFENSOR, Posicion.MEDIOCAMPO,
				Posicion.DELANTERO };
		for (Jugador j : e.getJugadores()) {
			p = seEncuentra(j.getPosicion(0), pos);
			if (p == null) {
				p = seEncuentra(j.getPosicion(1), pos);
			}
			if (p != null) {
				eliminarPosicion(p, pos);
				p = null;
			}
		}
		if(pos.length == 0) return true;
		else return false;
	}

	public static Posicion seEncuentra(Posicion p1, Posicion[] p2) {
		int i = 0;
		while (i < p2.length && !p1.equals(p2[i])) {
			i++;
		}
		if (p1.equals(p2[i]))
			return p1;
		return null;

	}

	public static void eliminarPosicion(Posicion p, Posicion[] p1) {
		int i = 0;
		while (i < p1.length && !p.equals(p1[i]))
			i++;
		for(int j = i+1; j < (p1.length-1); j++) {
			p1[j-1]= p1[j];	
		}
		p1 = Arrays.copyOf(p1, p1.length - 1);
	}
}
