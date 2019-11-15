package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.entites.ObjetGeometrique;
import fr.diginamic.entites.Rectangle;

public class TestObjet {

	public static void main(String[] args) {

		ObjetGeometrique[] calcul = new ObjetGeometrique[2];
		calcul[0] = new Cercle(8);
		calcul[1] = new Rectangle(10,5);
		
	
		
		for(int i=0;i<calcul.length;i++){
			System.out.println(calcul[i]);
		}
	}
}
