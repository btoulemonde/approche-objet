
 
package fr.diginamic.formes;


public class Rectangle extends Forme {
	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	/* (non-Javadoc)
	 * @see fr.diginamic.formes.Forme#calculerSurface()
	 */
	@Override
	public double calculerSurface() {
		return longueur * largeur;
	}

	/* (non-Javadoc)
	 * @see fr.diginamic.formes.Forme#calculerPerimetre()
	 */
	@Override
	public double calculerPerimetre() {
		return longueur*2 + largeur*2;
	}

}
