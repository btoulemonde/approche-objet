package fr.diginamic.salaire;

public abstract class Intervenant {
	
	protected String nom;
	protected String prenom;
	
	public abstract long getSalaire();
	public final void afficherDonnees(){
		System.out.println(nom + " " + prenom + " " + this.getSalaire() + " €"+ " Statut: "+ this.afficherStatut());
	}

	public abstract String afficherStatut();
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	
	

}
