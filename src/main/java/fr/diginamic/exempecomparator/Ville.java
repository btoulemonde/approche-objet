package fr.diginamic.exempecomparator;

public class Ville {
	/** nom de la ville */
	private String nom;
	/** population totale */
	private int population;

	public Ville(String nom, int population) {
		this.nom = nom;
		this.population = population;
	}

	@Override
	public String toString() {
		return nom + " " + population + " hab";
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * Setter
	 * 
	 * @param population
	 *            the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
}
