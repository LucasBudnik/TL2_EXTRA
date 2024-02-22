package planeta;

public class Planet {
	private int cantidadDeLunas;
	private Tipo tipo;
	private double diametro;
	private long distancia;
	private String nombre;

	public Planet() {

	}

	public Planet(String nombre, int cantidadDeLunas, Tipo tipo, double diametro, long distancia) {
		this.nombre = nombre;
		this.cantidadDeLunas = cantidadDeLunas;
		this.diametro = diametro;
		this.distancia = distancia;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo() {
		return this.tipo;
	}

	public int getCantidadDeLunas() {
		return cantidadDeLunas;
	}

	public void setCantidadDeLunas(int cantidadDeLunas) {
		this.cantidadDeLunas = cantidadDeLunas;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public long getDistancia() {
		return distancia;
	}

	public void setDistancia(long distancia) {
		this.distancia = distancia;
	}

	@Override
	public String toString() {
		return "cantidadDeLunas=" + cantidadDeLunas + ", tipo=" + tipo + ", diametro=" + diametro + ", distancia="
				+ distancia + ", nombre=" + nombre;
	}

}
