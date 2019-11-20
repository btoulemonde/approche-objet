package fr.diginamic.banque.entites;

public class Compte {

	private String numeroCompte;
	private double soldeInitial;

	public Compte(String numeroCompte, double soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeInitial = soldeCompte;
	}

	// méthode equals

	public boolean equals(Object obj) {
		if (!(obj instanceof Compte)) {
			return false;
		}
		Compte autre = (Compte) obj;
		return this.numeroCompte.equals(autre.getNumeroCompte()) && this.soldeInitial == autre.getSoldeCompte();
	}

	// retourne numero et solde compte

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compte [numeroCompte=" + numeroCompte + ", soldeInitial=" + soldeInitial + "]";
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
