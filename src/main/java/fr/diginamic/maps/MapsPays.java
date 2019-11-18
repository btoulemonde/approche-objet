package fr.diginamic.maps;

import java.util.HashMap;

/*
 
• Dans ce TP nous allons retravailler avec la classe Pays et les informations des TPs précédent.
• Dans cette classe, creez une map permettant de stocker les instances de pays (valeur) en fonction de leur nom (clé).
• Recherchez et supprimez le pays qui a le moins d’habitants
• Affichez l’ensemble des pays restants.
 */

public class MapsPays {

	public static void main(String[] args) {
		HashMap<String, Pays> map = new HashMap<String, Pays>();
		map.put("USA", new Pays("USA", 200, 50));
		map.put("France", new Pays("France", 60, 45));
		map.put("Italie", new Pays("Italie", 50, 38));
		map.put("UK", new Pays("UK", 45, 40));
		map.put("Allemagne", new Pays("Allemagne", 70, 47));


		

	}

}
