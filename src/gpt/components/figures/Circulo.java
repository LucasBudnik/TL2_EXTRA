package gpt.components.figures;

import gpt.components.*;

public class Circulo extends FiguraGeometrica {
	private double radio;

	public Circulo() {

	}

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double calcularArea() {
		return Area.calcularArea(this);
	}

	public double calcularPerimetro() {
		return 3.14 * this.getRadio() * this.getRadio();
	}

	@Override
	public String toString() {
		return "circulo";
	}

}
