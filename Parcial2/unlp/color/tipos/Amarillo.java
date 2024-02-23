package unlp.color.tipos;

import unlp.color.Color;

import unlp.color.Primario;
import unlp.enums.Intensidad;
import unlp.enums.Tipo;

public class Amarillo extends Primario {
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
}
