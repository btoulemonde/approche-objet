package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	
		//m�thode afficher
		
		public void afficher(Forme forme) {
			System.out.println("p�rim�tre: " + forme.calculerPerimetre());
			System.out.println("surface : " + forme.calculerSurface());
		}

	

}
