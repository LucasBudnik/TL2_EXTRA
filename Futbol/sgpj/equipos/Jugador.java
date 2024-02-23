package sgpj.equipos;

import sgpj.posiciones.Posicion;

public class Jugador {
	private final int POSICIONES = 2;
	private Posicion[] posicion = new Posicion[POSICIONES];
	private int indice = 0;

	/*---------------------------------------------------------------------
	 * CONSTRUCTORES*/
	public Jugador() {

	}

//	public Jugador(Posicion[] posiciones) {
//		if (posiciones.length > POSICIONES) {
//			this.indice = this.POSICIONES;
//			for (int i = 0; i < POSICIONES; i++)
//				this.posicion[i] = posiciones[i];
//		} else {
//			for (int i = 0; i < posiciones.length; i++)
//				this.posicion[i] = posiciones[i];
//			this.indice = posiciones.length;
//		}
//
//	}

	public Jugador(Posicion p1, Posicion p2) {
		this.posicion[0] = p1;
		this.posicion[1] = p2;
		this.indice = 2;
	}

	/*---------------------------------------------------------------------
	 * Add Posicion*/
	public boolean addPosicion(Posicion p) {
		if (indice < POSICIONES && !this.existePosicion(p)) {
			posicion[this.indice] = p;
			this.indice++;
			return true;
		}
		return false;
	}

	/*---------------------------------------------------------------------
	 * ya tiene la posicion ?*/
	public boolean existePosicion(Posicion p) {
		for (int i = 0; i < indice; i++)
			if (p.equals(this.posicion[indice]))
				return true;
		return false;
	}

	public Posicion getPosicion(int i) {
		if (i <= this.indice)
			return posicion[i];
		return null;
	}

	public int getIndice() {
		return this.indice;
	}

}
