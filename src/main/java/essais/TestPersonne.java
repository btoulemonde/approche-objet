package essais;


import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale a = new AdressePostale (12, "rue du chevrefeuille", 34000, "Montpellier");

		Personne p1 = new Personne ("Toulemonde", "Baptiste", a);
		
		AdressePostale b = new AdressePostale(69, "rue de Douarnenez", 29000, "Quimper" );

		Personne p2 = new Personne ("Toulemonde", "Baptiste", b);
		
	}

}
