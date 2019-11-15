package fr.diginamic.banque.entites;

public class Compte {

	private String numeroCompte;
	private double soldeInitial;

	public Compte(String numeroCompte, double soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeInitial = soldeCompte;
	}
	//retourne numero et solde compte
	public String toString () {
		return numeroCompte + " " + soldeInitial + " €";
	}
 
	// getters et setters
	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSoldeCompte() {
		return soldeInitial;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeInitial = soldeCompte;
	}

}
