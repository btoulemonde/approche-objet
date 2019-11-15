package fr.diginamic.entites;


public class Cercle {
	
	private double rayon;

	//constructeur cercle
	public Cercle(double rayon) {

		this.rayon = rayon;
	}
	
	public double perimetre(){
		return 2*3.14*rayon;
	}
	public double surface(){
		return 3.14 *rayon*rayon;
	}


	public String toString() {
		return "perimetre = " + perimetre() + ", surface = " + surface();
	}
	

}
