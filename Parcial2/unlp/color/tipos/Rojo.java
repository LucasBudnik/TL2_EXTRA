package unlp.color.tipos;

import unlp.color.Color;
import unlp.color.Primario;
import unlp.enums.Intensidad;
import unlp.enums.Tipo;

public class Rojo extends Primario {
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
		return new Verde();
	}

	/*---------------------------------------------
	 * COMBINAR
	 */
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
	
	
}
