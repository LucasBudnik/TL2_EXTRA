package unlp.color.tipos;

import unlp.color.Color;
import unlp.color.Secundario;
import unlp.enums.Intensidad;
import unlp.enums.Tipo;

public class Naranja extends Secundario {

	/*---------------------------------------------
	 * VARIABLES DE INSTANCIA
	 */
	private Tipo tipo;
	private Intensidad intensidad;


	/*---------------------------------------------
	 * GETTERS && SETTERS
	 */
	
	@Override
	public Tipo getTipo() {
		return this.tipo;
	}

	@Override
	public Intensidad getIntensidad() {
		return this.intensidad;
	}

	@Override
	public void setIntensidad(Intensidad intensidad) {
		this.intensidad = intensidad;
	}

	/*---------------------------------------------
	 * COMPLEMENTARIO
	 */
	
	@Override
	public Color complementario() {
		return new Azul();
	}

	
}
