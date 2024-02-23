package unlp.color.tipos;

import unlp.enums.*;
import unlp.color.Color;
import unlp.color.Primario;

public class Azul extends Primario {

	/*---------------------------------------------
	 * VARIABLES DE INSTANCIA
	 */
	private Intensidad intensidad;
	private Tipo tipo = Tipo.FRIO;


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

	
	
}
