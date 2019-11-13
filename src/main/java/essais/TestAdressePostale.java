package essais;

import entites.AdressePostale;

public class TestAdressePostale {
	
	public static void main(String[] args) {
		
		AdressePostale a = new AdressePostale();
		a.numeroRue = 12;
		a.libelleRue = "rue du chevrefeuille";
		a.codePostal = 34000;
		a.ville = "Montpellier";
			
		AdressePostale b = new AdressePostale();
		b.numeroRue = 69;
		b.libelleRue = "rue de Douarnenez";
		b.codePostal = 29000;
		b.ville = "Quimper";	
		
			
		
	}

}
