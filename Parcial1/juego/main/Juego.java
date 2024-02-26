package juego.main;

import juego.component.*;
import juego.component.gestos.*;

public class Juego {
	public static Resultado jugarRonda(Gesto g1, Gesto g2){
			return g1.compararCon(g2);
	}
}
