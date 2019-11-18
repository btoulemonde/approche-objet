package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;


public class Ville {

	public static void main(String[] args) {
		
			HashMap<Integer, String> mapVilles = new HashMap<>();
			mapVilles.put(13, "Marseille");
			mapVilles.put(34, "Montpellier");
			mapVilles.put(44, "Nantes");
			mapVilles.put(75, "Paris");
			mapVilles.put(31, "Toulouse");
			mapVilles.put(59, "Lille");
			mapVilles.put(69, "Lyon");
			mapVilles.put(33, "Bordeaux");
			
			//enseble des clés
			Iterator<Integer>keysIte = mapVilles.keySet().iterator();
			while(keysIte.hasNext()){
				Integer a = keysIte.next();
				System.out.println(a);
			}
			
			//ensemble des valeurs
			Iterator<String>villes = mapVilles.values().iterator();
			while(villes.hasNext()){
				String a = villes.next();
				System.out.println(a);
			}
				
			//taille de la mapr
			System.out.println("taille de la map: "+mapVilles.size());
			
			

	}

}
