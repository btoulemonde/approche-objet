package fr.diginamic.maps;
/*
Tâches à réaliser :
• Créer une map appelée map3 et qui contient l’ensemble des données des 2 maps précédentes 
avec les mêmes clés et les mêmes valeurs
 */

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {

	public static void main(String[] args) {
		
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		//cration map3
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		//fusion des deux maps
		Iterator<Integer> ite = map1.keySet().iterator();
		Iterator<String>couleur = map1.values().iterator();
		while(ite.hasNext()){
			Integer a = ite.next();
			String b = couleur.next();
		map3.put(a, b);
		}
		Iterator<Integer> ite2 = map2.keySet().iterator();
		Iterator<String>couleur2 = map2.values().iterator();
		while(ite2.hasNext()){
			Integer a = ite2.next();
			String b = couleur2.next();
		map3.put(a, b);
		
		}
		System.out.println(map3);		

	}

}
