package sgpj.partido;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sgpj.equipos.Equipo;
import sgpj.equipos.Jugador;
import sgpj.posiciones.Posicion;

public class Partido {

	/*---------------------------------------------------------------------
	 * */
	public static boolean cumpleLaCantidadDeJugadores(Equipo e) {
		return e.calcularJugadore() >= 5;
	}

	/*---------------------------------------------------------------------
	 * */
	public static boolean cumplenPosiciones(Equipo e) {
		List<Posicion> l = new ArrayList<Posicion>();

		l.add(Posicion.ARQUERO);
		l.add(Posicion.DEFENSOR);
		l.add(Posicion.DEFENSOR);
		l.add(Posicion.MEDIOCAMPO);
		l.add(Posicion.DELANTERO);

		for (Jugador j : e.getJugadores()) {
			if (l.contains(j.getPosicion(0))) {
				l.remove(j.getPosicion(0));
			} else {
				if (l.contains(j.getPosicion(1)))
					l.remove(j.getPosicion(1));
			}
			if (l.isEmpty())
				return true;
		}

		return false;

	}

	/*---------------------------------------------------------------------
	 * */

	/*---------------------------------------------------------------------
	 * */
	public static void eliminarPosicion(Posicion p, Posicion[] p1) {
		int i = 0;
		while (i < p1.length && !p.equals(p1[i]))
			i++;
		for (int j = i + 1; j < (p1.length - 1); j++) {
			p1[j - 1] = p1[j];
		}
		p1 = Arrays.copyOf(p1, p1.length - 1);
	}
}
