package unlp.color.tipos;

import unlp.color.Color;
import unlp.color.Secundario;
import unlp.enums.Tipo;

public class Naranja extends Secundario {

	/*---------------------------------------------
	 * CONSTRUCTOR
	 */
	public Naranja() {

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
		return new Azul();
	}
	/*---------------------------------------------
	 * NOMBRE
	 */
	@Override
	public String getNombre() {
		return "Naranja";
	}

}
