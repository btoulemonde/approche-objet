package fr.diginamic.exempecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTri {
	public static void main(String[] args) {
		List<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Paris", 10000000));
		villes.add(new Ville("Nantes", 280000));
		villes.add(new Ville("New York", 17000000));
		villes.add(new Ville("Saint-Herblain", 25000));
		Collections.sort(villes, new VilleComparator());
		for (Ville v : villes) {
			System.out.println(v);
		}
	}
}
