package unlp.color;

import unlp.enums.*;

public abstract class Color {

	public Intensidad intensidad;

	public Tipo tipo;


	public abstract Tipo getTipo();

	public abstract Intensidad getIntensidad();

	public abstract void setIntensidad(Intensidad intensidad);
	
	public abstract Color complementario();
}
