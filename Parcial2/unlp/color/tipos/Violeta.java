package unlp.color.tipos;

import unlp.color.Color;
import unlp.color.Secundario;
import unlp.enums.Tipo;


public class Violeta extends Secundario {
	public Violeta() {
		
	}
	/*---------------------------------------------
	 * GETTERS
	 */
	public Tipo getTipo() {
		return Tipo.FRIO;
	}


	/*---------------------------------------------
	 * COMPLEMENTARIO
	 */
	@Override
	public Color complementario() {
		return new Amarillo();
	}
	/*---------------------------------------------
	 * NOMBRE
	 */
	@Override
	public String getNombre() {
		return "Violeta";
	}
}
