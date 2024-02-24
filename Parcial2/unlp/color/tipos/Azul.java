package unlp.color.tipos;


import unlp.color.Color;
import unlp.color.Primario;
import unlp.enums.Tipo;

public class Azul extends Primario {

	public Azul() {
		
	}

	/*---------------------------------------------
	 * GETTERS
	 */
	public Tipo getTipo() {
		return Tipo.FRIO;
	}

	/*---------------------------------------------
	 * COMBINAR
	 */
	@Override
	public Color combinarCon(Primario color) {
		return color.combinarConAzul();
	}
	
	@Override
	public Color combinarConAzul() {
		return new Azul();
	}

	@Override
	public Color combinarConRojo() {
		return new Violeta();
	}

	@Override
	public Color combinarConAmarillo() {
		return new Verde();
	}


	/*---------------------------------------------
	 * COMPLEMENTARIO
	 */
	@Override
	public Color complementario() {
		return new Naranja();
	}
	/*---------------------------------------------
	 * NOMBRE
	 */
	@Override
	public String getNombre() {
		return "Azul";
	}

	
	
}
