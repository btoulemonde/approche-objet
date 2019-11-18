package fr.diginamic.listes;

public class Ville {
	private String nom;
	private int nbrHab;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " [Ville=" + nom + ", nbrHab=" + nbrHab + "]";
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
	 * @return the nbrHab
	 */
	public int getNbrHab() {
		return nbrHab;
	}

	/**
	 * @param nbrHab the nbrHab to set
	 */
	public void setNbrHab(int nbrHab) {
		this.nbrHab = nbrHab;
	}

	public Ville(String nom, int nbrHab) {
		this.nom = nom;
		this.nbrHab = nbrHab;
	}
	

}
