// creamos un sistema solar 

package sistemaSolar;

import planeta.Planeta;

public final class SistemaSolar {
	// el sistema solar tiene 8 planetas
	private final int PLANETAS = 8;
	// el sistema solar es singleton, por lo tanto no se puede instanciar mas de una vez
	private static SistemaSolar INSTANCE;
	// creamos un vector de planetas vacio
	private Planeta[] planet = new Planeta[PLANETAS];
	// creamos un indice vacio
	private int indice = 0;

	private SistemaSolar() {

	}

	public static SistemaSolar getSistemaSolar() {
		if (INSTANCE == null) {
			INSTANCE = new SistemaSolar();
		}
		return INSTANCE;
	}
	
	public Planeta getPlaneta(int n) {
		return planet[n];
	}
	
	public boolean addPlanet(Planeta planeta) {
		if (indice >= PLANETAS) {
			return false;
		}
		planet[indice] = planeta;
		indice++;
		return true;
	}

	public void mostrarPlanetas() {
		for (int i = 0; i < PLANETAS; i++) {
			System.out.println(planet[i].toString());
		}
	}
}
