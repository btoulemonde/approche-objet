package fr.diginamic.banque.essais;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {

		Compte c1 = new Compte("123456AB", 2000);
		Compte c2 = new Compte("123456AB", 2000);
		Compte c3 = c2;
		

		System.out.println(c1.equals(c2));
		System.out.println(c3.equals(c2));
		// Compte[] comptes = new Compte[2];
		//
		// comptes[0] = new Compte("12A", 150.0);
		// comptes[1] = new CompteTaux("12A", 250.0, 1.5);
		//
		// for (int i = 0; i < comptes.length; i++) {
		// System.out.println(comptes[i]);
		// }
	}
}
