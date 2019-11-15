package fr.diginamic.chaines;

public class Compte {
	private String nom;
	private String prenom;
	private String numeroCompte;
	private String solde;
	
	public Compte(String nom, String prenom, String numeroCompte, String solde){
		this.nom = nom;
		this.prenom = prenom;
		this.numeroCompte = numeroCompte;
		this.solde = solde; 
	}
	public String toString(){
		return "Nom : " + nom + "\n"+"Prenom : " + prenom + "\n" + "Numéro de compte : " + numeroCompte+"\n"+ "Solde : " + solde+" €";
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the numeroCompte
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * @param numeroCompte the numeroCompte to set
	 */
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/**
	 * @return the solde
	 */
	public String getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(String solde) {
		this.solde = solde;
	}

}
