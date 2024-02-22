// creamos un sistema solar 

package sistemaSolar;

import planeta.Planeta;

public final class SistemaSolar {
	
	private final int PLANETAS = 8;
	
	private static SistemaSolar INSTANCE;
	
	private Planeta[] planet = new Planeta[PLANETAS];
	private int indice = 0;

	
	/*------------------------------------------------------------------
	 * CONSTRUCTORES*/
	private SistemaSolar() {

	}

	
	/*------------------------------------------------------------------
	 * CONSTRUCTOR SINGLETON*/
	public static SistemaSolar getSistemaSolar() {
		if (INSTANCE == null) {
			INSTANCE = new SistemaSolar();
		}
		return INSTANCE;
	}
	
	
	/*------------------------------------------------------------------
	 * ARREGLO DE PLANETAS*/
	public Planeta getPlaneta(int n) {
		return planet[n];
	}
	
	
	/*------------------------------------------------------------------
	 * AGREGAR UN PLANETA*/
	public boolean addPlanet(Planeta planeta) {
		if (indice >= PLANETAS) {
			return false;
		}
		planet[indice] = planeta;
		indice++;
		return true;
	}

	
	/*------------------------------------------------------------------
	 * MOSTRAR PLANETAS*/
	public void mostrarPlanetas() {
		for (int i = 0; i < PLANETAS; i++) {
			System.out.println(planet[i].toString());
		}
	}
}
