package fr.diginamic.jdr;

import java.util.Random;

public class Troll extends Creature {

	public Troll (){
		
		//force et vie init
		this.force = 10 + new Random().nextInt(6);
		this.vie = 20 +  new Random().nextInt(30);
	}
}
