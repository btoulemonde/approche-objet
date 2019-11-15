package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private int nbrJour;
	private long salaireJour;

	@Override
	public long getSalaire() {
		return nbrJour * salaireJour;
	}

	public Pigiste(String nom, String prenom, int nbrJour, long salaireJour) {
		super(nom, prenom);
		this.nbrJour = nbrJour;
		this.salaireJour = salaireJour;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pigiste " + nom + " " + prenom + ": salaire = " + getSalaire() + " €";

	}
	
	public String afficherStatut() {
		return "Pigiste";
	}

}
