package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	private long salaire;
	
	@Override
	public long getSalaire() {
		return salaire;
	}

	
	public Salarie(String nom, String prenom, long salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Salarie " + nom+ " " + prenom + ": salaire = " + getSalaire() +" €" ;
	}

	@Override
	public String afficherStatut() {
		return "Salarié";
	}
	
	

}
