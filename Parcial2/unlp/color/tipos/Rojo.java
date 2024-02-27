package unlp.color.tipos;

import unlp.color.Color;
import unlp.color.Primario;
import unlp.enums.Tipo;

public class Rojo extends Primario {
	public Rojo() {
		
	}
	/*---------------------------------------------
	 * GETTERS
	 */
	public Tipo getTipo() {
		return Tipo.CALIDO;
	}

	
	/*---------------------------------------------
	 * COMPLEMENTARIO
	 */
	@Override
	public Color complementario() {
		return new Verde();
	}

	/*---------------------------------------------
	 * COMBINAR
	 */
	// double dispatching
	@Override
	public Color combinarCon(Primario color) {
		return color.combinarConRojo();
	}
	

	@Override
	public Color combinarConAzul() {
		return new Violeta();
	}
	
	@Override
	public Color combinarConRojo() {
		return new Rojo();
	}

	@Override
	public Color combinarConAmarillo() {
		return new Naranja();
	}
	
	/*---------------------------------------------
	 * NOMBRE
	 */
	@Override
	public String getNombre() {
		return "Rojo";
	}
	
	
}
