package fr.diginamic.maps;


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
		
		while(ite.hasNext()){
			Integer a = ite.next();
			String b = map1.get(a);
		map3.put(a, b);
		}
		Iterator<Integer> ite2 = map2.keySet().iterator();
		
		while(ite2.hasNext()){
			Integer a = ite2.next();
			String b = map2.get(a);
		map3.put(a, b);
		
		}
		System.out.println(map3);	
		
		//deuxieme méthode..
		map3.putAll(map1);
		map3.putAll(map2);
		System.out.println(map3);
		

	}

}
