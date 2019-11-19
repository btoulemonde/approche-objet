package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMaps {

	public static void main(String[] args) {
		
		
		Map<String, Integer> mapSalaire = new HashMap<>();
		mapSalaire.put("Paul", 1750);
		mapSalaire.put("Hichman", 1825);
		mapSalaire.put("Yu", 2250);
		mapSalaire.put("Ingrid", 2015);
		mapSalaire.put("Chantal", 2418);
		
		//affichage taille map
		System.out.println("taille map: "+ mapSalaire.size());
		
		

	}

}
