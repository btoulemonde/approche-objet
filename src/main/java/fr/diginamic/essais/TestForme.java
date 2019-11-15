package fr.diginamic.essais;

import fr.diginamic.formes.Rectangle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;

public class TestForme {

	public static void main(String[] args) {
		
		
		
		Cercle c1 = new Cercle(5);
		Rectangle r1 = new Rectangle(3,4);
		Carre car1 = new Carre(4);
		
		AffichageForme a = new AffichageForme();
		a.afficher(c1);
		a.afficher(r1);
		a.afficher(car1);
	}

}
