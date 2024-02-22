package main;

import java.util.Scanner;

import planeta.Planet;
import sistemaSolar.SolarSystem;
import telescopio.Telescopio;

public class Menu {
	/*------------------------------------------------------------------
	 * Menu Principal*/
	public static void menu(SolarSystem s) {
		int n = 0;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("0: Salir" + "\n1: mostrar todos los planetas" + "\n2: acceder al telescopio");
			n = in.nextInt();
			if (n != 0) {
				switch (n) {
				case 0:
					System.out.println("Uds, ha salido con exito... ");
					break;
				case 1:
					s.mostrarPlanetas();
					break;

				case 2:
					menu2(in, s);
					break;
				default:
					System.out.println("Error en la seleccion. Vuelva a intentar...");
					break;
				}

			}

		} while (n != 0);
	}

	/*------------------------------------------------------------------
	 * Seccion Telescopio*/
	public static void menu2(Scanner in, SolarSystem s) {
		int n1;
		Planet p = new Planet();
		do {
			System.out
					.println("0: Salir.\n" + "1: Calcular La Distancia Planeta.\n" + "2: Indicar el tipo de planeta.");

			n1 = in.nextInt();
			if (n1 != 0) {
				if (n1 == 1 || n1 == 2)
					p = MenuPlanet(in, s);
				switch (n1) {
				case 1:
					System.out.println("Distancia Planeta: ");
					Telescopio.distanciaPlaneta(p);
					break;
				case 2:
					System.out.println("Tipo Planeta: ");
					Telescopio.tipoPlaneta(p);
					break;
				default:
					System.out.println("Error en la seleccion de la funcion de Telescopio. Vuelva a intentar...");
					break;
				}
			} else {
				System.out.println("Selecciono volver al menu principal");
			}
		} while (n1 != 0);
	}

	/*------------------------------------------------------------------
	 * Seleccion de Planeta*/
	public static Planet MenuPlanet(Scanner in, SolarSystem s) {
		int n2;
		do {
			System.out.println("selecciones planeta\n" + "0:MERCURIO,\n" + "1:VENUS\n" + "2:MARTE\n" + "3:TIERRA\n"
					+ "4:JUPITER\n" + "5:SATURNO\n" + "6:URANO\n" + "7:NEPTUNO");
			n2 = in.nextInt();
			if ((n2 >= 8) || (n2 < 0)) {
				System.out.println("Error en la seleccion de planeta, Vuelva A Intentar...");
			}
		} while ((n2 > 7) || (n2 < 0));
		return s.getPlaneta(n2);
	}
}
