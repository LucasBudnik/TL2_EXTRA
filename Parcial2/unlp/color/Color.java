package unlp.color;

import unlp.enums.*;

public abstract class Color {

	private Intensidad intensidad;
	

	public Intensidad getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(Intensidad intensidad) {
		this.intensidad = intensidad;
	}
	
	public abstract Tipo getTipo() ;

	public abstract String getNombre();
	
	public abstract Color complementario();
}
