package essais;


import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne a = new Personne ();
		a.nom = "Toulemonde";
		a.prenom = "Baptiste";
		AdressePostale c = new AdressePostale();
		c.numeroRue = 12;
		c.libelleRue = "rue du chevrefeuille";
		c.codePostal = 34000;
		c.ville = "Montpellier";
		
		Personne b = new Personne ();
		b.nom = "Toulemonde";
		b.prenom = "Baptiste";
		AdressePostale d = new AdressePostale();
		d.numeroRue = 12;
		d.libelleRue = "rue du chevrefeuille";
		d.codePostal = 34000;
		d.ville = "Montpellier";

		System.out.println(a);
		
	}

}
