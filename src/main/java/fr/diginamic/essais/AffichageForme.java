package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	
		//méthode afficher
		
		public void afficher(Forme forme) {
			System.out.println("périmètre: " + forme.calculerPerimetre());
			System.out.println("surface : " + forme.calculerSurface());
		}

	

}
