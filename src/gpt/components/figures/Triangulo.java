package gpt.components.figures;

import gpt.components.*;

public class Triangulo extends FiguraGeometrica {

	private double l1, l2, l3;

	public Triangulo() {

	}

	public Triangulo(double l1, double l2, double l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	public double getL1() {
		return l1;
	}

	public void setL1(double l1) {
		this.l1 = l1;
	}

	public double getL2() {
		return l2;
	}

	public void setL2(double l2) {
		this.l2 = l2;
	}

	public double getL3() {
		return l3;
	}

	public void setL3(double l3) {
		this.l3 = l3;
	}

	public boolean verify() {
		return ((this.getL1() < (this.getL2() + this.getL3())) && (this.getL2() < (this.getL3() + this.getL1()))
				&& (this.getL3() < (this.getL2() + this.getL1())));
	}

	public double calcularArea() {
		return Area.calcularArea(this);
	}

	public double calcularPerimetro() {
		return (this.getL1() + this.getL2() + this.getL3());
	}

	@Override
	public String toString() {
		return "Triangulo";
	}

}
