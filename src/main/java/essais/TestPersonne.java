package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale a = new AdressePostale(12, "rue du chevrefeuille", 34000, "Montpellier");

		Personne p1 = new Personne("Toulemonde", "Baptiste", a);
		
		p1.afficherIdentite();

		AdressePostale b = new AdressePostale(69, "rue de Douarnenez", 29000, "Quimper");

		Personne p2 = new Personne("Dupont", "Paul", b);
		
		p2.changerNom("Martin");
		p2.changerPrenom("Jean");
		
		p2.changerAdresse(a);
		p2.retourneNom();
		p2.afficherIdentite();
		

	}

}
