package sgpj.equipos;

import java.util.*;

public class Equipo {
	private List<Jugador> jugadores = new ArrayList<Jugador>();

	public Equipo() {

	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public int calcularJugadore() {
		return this.jugadores.size();
	}

	public void agregarJugador(Jugador j) {
		jugadores.add(j);
	}

	public boolean eliminarJugador(Jugador j1) {
		if (this.jugadores.contains(j1)) {
			this.jugadores.remove(j1);
		}
		return false;
	}

}
