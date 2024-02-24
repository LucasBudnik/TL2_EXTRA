package unlp.main;

import unlp.color.tipos.*;
import unlp.color.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Amarillo amarillo = new Amarillo();
		Azul azul = new Azul();
		Rojo rojo = new Rojo();

		Color c = Pintar.mezclar(amarillo, azul);

		Color c1 = Pintar.mezclar(rojo, azul);

		Color c2 = Pintar.mezclar(amarillo, rojo);
		System.out.println("-------------------------");
		System.out.println("AZUL+AMARILLO=" + c.getNombre());
		System.out.println("ROJO+AZUL=" + c1.getNombre());
		System.out.println("AMARILLO+ROJO=" + c2.getNombre());
		System.out.println("-------------------------");
		List<Color> l = new ArrayList<Color>();
		l.add(new Verde());
		l.add(new Amarillo());
		l.add(new Rojo());
		l.add(new Naranja());
		l.add(new Verde());
		l.add(new Violeta());
		l.add(new Rojo());
		l.add(new Azul());

		List<Color> frios = Pintar.filtrarFrios(l);
		List<Color> calidos = Pintar.filtrarCalidos(l);
		List<Color> complementarios = Pintar.listarComplementarios(l);

		System.out.println("mostrar lista");
		mostrarLista(l);
		System.out.println("-------------------------");
		System.out.println("mostrar frios");
		mostrarLista(frios);
		System.out.println("-------------------------");
		System.out.println("mostrar calidos");
		mostrarLista(calidos);
		System.out.println("-------------------------");
		System.out.println("mostrar complementarios");
		mostrarLista(complementarios);

	}

	public static void mostrarLista(List<Color> l) {
		for (Color c : l) {
			System.out.println(c.getNombre());
		}
	}

}
