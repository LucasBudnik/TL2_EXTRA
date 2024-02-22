// creamos un telescopio

package telescopio;

import planeta.Planeta;

public class Telescopio {
	/*------------------------------------------------------------------
	 * VARIABLES*/
	private static Telescopio telescopio;

	/*------------------------------------------------------------------
	 * CONSTRUCTORES*/
	private Telescopio() {

	}

	public static Telescopio getTelescopio() {
		if (telescopio == null) {
			telescopio = new Telescopio();
		}
		return telescopio;
	}
	
	/*------------------------------------------------------------------
	 * OBTENER DISTANCIA RESPECTO DEL SOL DE UN PLANETA DADO*/
	public static void distanciaPlaneta(Planeta p) {
		System.out
				.println("La Distancia al Sol de " + p.getNombre() + " es de " + p.getDistancia() + " millones de km");
	}
	
	
	/*------------------------------------------------------------------
	 * OBTENER TIPO DE PLANETA DE UN PLANETA DADO*/
	public static void tipoPlaneta(Planeta p) {
		if (p != null) {
			switch (p.getTipo()) {
			case ROCOSO:
				System.out.println(
						"Los Planetas ROCOSOS, están compuestos principalmente por materiales sólidos como rocas y metales.");
				break;
			case GASEOSO:
				System.out.println(
						"Los Planetas GASEOSOS, están formados principalmente por gases como hidrógeno y helio, con densas atmósferas y sin superficie sólida definida.");
				break;
			default:
				System.out.println("Nada");
				break;
			}
		}
		System.out.println("el planeta esta vacio");
	}
}
