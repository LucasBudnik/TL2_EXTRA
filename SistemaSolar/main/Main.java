package main;

import planeta.*;
import sistemaSolar.*;

public class Main {

	public static void main(String[] args) {

		SistemaSolar s = SistemaSolar.getSistemaSolar();

		/*
		 * agregamos los planetas al sistema solar (nombre, cantidad de lunas, tipo de
		 * planeta, diametro, distancia)
		 */
		s.addPlanet(new Planeta("MERCURIO", 0, Tipo.ROCOSO, 4880L, (long) 57.9));
		s.addPlanet(new Planeta("VENUS", 0, Tipo.ROCOSO, 12104L, (long) 108.2));
		s.addPlanet(new Planeta("MARTE", 2, Tipo.ROCOSO, 6779L, (long) 227.9));
		s.addPlanet(new Planeta("TIERRA", 1, Tipo.ROCOSO, 12742L, (long) 149.6));

		s.addPlanet(new Planeta("JUPITER", 80, Tipo.GASEOSO, 139820L, (long) 778.6));
		s.addPlanet(new Planeta("SATURNO", 80, Tipo.GASEOSO, 116.460, (long) 1429));
		s.addPlanet(new Planeta("URANO", 25, Tipo.GASEOSO, 50724L, (long) 2871));
		s.addPlanet(new Planeta("NEPTUNO", 14, Tipo.GASEOSO, 49244L, (long) 4498));

		Menu.menuPrincipal(s);
	}


}
