package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie s1 = new Salarie("Durand", "Paul", 2000);
		System.out.println(s1);
		Pigiste p1 = new Pigiste ("Martin", "Julie", 10, 100);
		System.out.println(p1);
		
		s1.afficherDonnees();
		p1.afficherDonnees();
	}

}
