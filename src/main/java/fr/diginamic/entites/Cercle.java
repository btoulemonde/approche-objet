package fr.diginamic.entites;

public class Cercle implements ObjetGeometrique {
	private double rayon;

	@Override
	public double perimetre() {
		return 2*3.14*rayon;
	}

	
	public String toString() {
		return "Cercle: perimetre = " + perimetre() + ", surface = " + surface() ;
	}

	@Override
	public double surface() {
		return 3.14* rayon*rayon;
	}

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	
	
	

}
