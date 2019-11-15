package fr.diginamic.entites;



public class Rectangle implements ObjetGeometrique {
	private double longueur;
	private double largeur;

	@Override
	public double perimetre() {
		return longueur * 2 + largeur * 2;
	}

	@Override
	public double surface() {
		return longueur * largeur;
	}

	
	public String toString() {
		return "Rectangle : perimetre = " + perimetre() + ", surface = " + surface() ;
	}

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

}
