package fr.diginamic.jdr;

import java.util.Random;

public class Loup extends Creature {
	
	public Loup(){
		//force et vie init
		this.force = 3 + new Random().nextInt(6);
		this.vie = 5 +  new Random().nextInt(6);
	}

}
