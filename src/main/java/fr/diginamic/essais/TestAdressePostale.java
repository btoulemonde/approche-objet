package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;

public class TestAdressePostale {
	
	public static void main(String[] args) {
		
		
		AdressePostale a = new AdressePostale (12, "rue du chevrefeuille", 34000, "Montpellier");
		
		System.out.println(a);
			
		AdressePostale b = new AdressePostale(69, "rue de Douarnenez", 29000, "Quimper" );
		System.out.println(b);

	
		
			
		
	}

}
