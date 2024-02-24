package unlp.color.tipos;

import unlp.color.Color;
import unlp.color.Secundario;
import unlp.enums.Tipo;


public class Verde extends Secundario{

	public Verde() {
		
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
		return new Rojo();
	}
	/*---------------------------------------------
	 * NOMBRE
	 */
	@Override
	public String getNombre() {
		return "Verde";
	}
	
}
