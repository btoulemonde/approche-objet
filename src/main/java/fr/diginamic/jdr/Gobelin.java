package fr.diginamic.jdr;

import java.util.Random;

public class Gobelin extends Creature {

	
	public Gobelin (){
		
		//force et vie init
		this.force = 5 + new Random().nextInt(6);
		this.vie = 10 +  new Random().nextInt(6);
	}
}
