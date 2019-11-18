package fr.diginamic.jdr;

import java.util.Random;

public class Personnage extends Creature {
	private int score;
	private String nom;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param force
	 * @param vie
	 * @param score
	 */
	
	//force vie et score initial
	public Personnage(String nom) {
		this.force = 12 + new Random().nextInt(7);
		this.vie = 20 +  new Random().nextInt(31);
		this.score = 0;
		this.nom = nom;
	}

	
	
}
