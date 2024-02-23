package unlp.main;

import java.util.ArrayList;
import java.util.List;

import unlp.color.*;
import unlp.enums.Tipo;

public class Pintar {
	public static Secundario mezclar(Primario p1, Primario p2) {
		return (Secundario) p1.combinarCon(p2);
	}

	public static List<Color> filtrarFrios(List<Color> lcolor) {
		List<Color> l = new ArrayList<>();
		for (Color c : lcolor) {
			if (c.getTipo() == Tipo.FRIO) {
				l.add(c);
			}
		}
		return l;
	}

	public static List<Color> filtrarCalidos(List<Color> lcolor) {
		List<Color> l = new ArrayList<>();
		for (Color c : lcolor) {
			if (c.getTipo() != Tipo.FRIO) {
				l.add(c);
			}
		}
		return l;
	}

	public static List<Color> listarComplementarios(List<Color> lcolor) {
		List<Color> l = new ArrayList<>();
		for (Color c : lcolor) {
			l.add(c.complementario());
		}
		return l;
	}

//	public static List<Color> listarComplementarios(List<Color> lcolor);
}
