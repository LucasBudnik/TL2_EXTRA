package unlp.color.tipos;

import unlp.color.Color;

import unlp.color.Primario;
import unlp.enums.Tipo;

public class Amarillo extends Primario {

	public Amarillo() {

	}

	/*---------------------------------------------
	 * GETTERS
	 */
	public Tipo getTipo() {
		return Tipo.CALIDO;
	}

	/*---------------------------------------------
	 * COMBINAR
	 */
	@Override
	public Color combinarCon(Primario color) {
		return color.combinarConAmarillo();
	}

	@Override
	public Color combinarConAzul() {
		return new Verde();
	}

	@Override
	public Color combinarConRojo() {
		return new Naranja();
	}

	@Override
	public Color combinarConAmarillo() {
		return new Amarillo();
	}

	/*---------------------------------------------
	 * COMPLEMENTARIO
	 */
	@Override
	public Color complementario() {
		return new Violeta();
	}
	/*---------------------------------------------
	 * NOMBRE
	 */
	@Override
	public String getNombre() {
		return "Amarillo";
	}
}
