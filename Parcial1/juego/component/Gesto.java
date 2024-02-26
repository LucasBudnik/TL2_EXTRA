package juego.component;

public abstract class Gesto {
	public abstract Resultado compararCon(Gesto gesto);
	public abstract Resultado compararConTijera();
	public abstract Resultado compararConPapel();
	public abstract Resultado compararConPiedra();
	
	
}
