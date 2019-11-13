package essais;


import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale a = new AdressePostale();
		a.numeroRue = 12;
		a.libelleRue = "rue du chevrefeuille";
		a.codePostal = 34000;
		a.ville = "Montpellier";
		
		Personne p1 = new Personne ();
		p1.nom = "Toulemonde";
		p1.prenom = "Baptiste";
		p1.adresse = a;
		
		AdressePostale b = new AdressePostale();
		b.numeroRue = 69;
		b.libelleRue = "rue de Douarnenez";
		b.codePostal = 29000;
		b.ville = "Quimper";	
	
		Personne p2 = new Personne ();
		p2.nom = "Toulemonde";
		p2.prenom = "Baptiste";
		p2.adresse  = b;

	}

}
