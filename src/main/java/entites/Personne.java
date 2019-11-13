package entites;

public class Personne {

	String nom;
	String prenom;
	AdressePostale adresse;

	public Personne(String nom, String prenom, AdressePostale adresse) {

		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public void afficherIdentite() {

		System.out.println(prenom + " " + nom.toUpperCase()+" " + adresse);

	}

	public void changerNom(String nom) {

		this.nom = nom;
	}

	public void changerPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void changerAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	public String retourneNom (String nom){
		return nom;
	}
	
	public String retournePrenom (String prenom){
		return prenom;
	}
	
	public AdressePostale retourneAdresse (AdressePostale adresse){
		return adresse;
	}
}
