package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("Printemps", 1), ETE("Eté", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String nom;
	private int ordre;

	/**
	 * @param nom
	 * @param ordre
	 */
	private Saison(String nom, int ordre) {
		this.nom = nom;
		this.ordre = ordre;
	}

	public static Saison getSaison(int ordre) {
		Saison[] saisons = Saison.values();
		for (Saison s : saisons) {
			if (s.getOrdre() == ordre) {
				return s;
			}

		}
		return null;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the ordre
	 */
	public int getOrdre() {
		return ordre;
	}

	/**
	 * @param ordre
	 *            the ordre to set
	 */
	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

}
