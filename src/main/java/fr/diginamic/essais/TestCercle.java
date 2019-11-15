package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle c1 = new Cercle(10);
		Cercle c2 = new Cercle(7);
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		
		Cercle c3 = CercleFactory.cercle(8);
		System.out.println("cercle 3 : " + c3);

	}
}
