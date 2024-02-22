package gpt.components.figures;

import gpt.components.*;

public class Cuadrado extends FiguraGeometrica {

	private double lado;

	public Cuadrado() {

	}

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		return Area.calcularArea(this);

	}

	public double calcularPerimetro() {
		return (4 * this.getLado());
	}

	@Override
	public String toString() {
		return "Cuadrado";
	}

}
