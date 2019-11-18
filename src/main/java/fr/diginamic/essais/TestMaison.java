package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
	
		Maison maison1 = new Maison();
		
		
		maison1.ajoutPiece(new Chambre(20, 0));
		maison1.ajoutPiece(new Chambre(12, 1));
		maison1.ajoutPiece(new Chambre(11, 1));
		maison1.ajoutPiece(new Cuisine(9,0));
		maison1.ajoutPiece(new Salon (20, 0));
		maison1.ajoutPiece(new SalleDeBain(14,1));
		maison1.ajoutPiece(new WC (2,0));
		maison1.ajoutPiece(new WC (3,1));
		

		System.out.println("surface maison = " + maison1.superficieTolale());
		System.out.println("surface rdc = " + maison1.superficieEtage(0));
		System.out.println("surface 1er étage = " + maison1.superficieEtage(1));
		System.out.println("surface chambres = " + maison1.superficiePiece("Chambres"));
		System.out.println("nombre de chambres = " + maison1.nombreTypePiece("Chambres"));
	}

}
