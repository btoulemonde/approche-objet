package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

import sets.Pays;

/*
 
� Dans ce TP nous allons retravailler avec la classe Pays et les informations des TPs pr�c�dent.
� Dans cette classe, creez une map permettant de stocker les instances de pays (valeur) en fonction de leur nom (cl�).
� Recherchez et supprimez le pays qui a le moins d�habitants
� Affichez l�ensemble des pays restants.
 */

public class MapsPays {

	public static void main(String[] args) {
		//creez une map permettant de stocker les instances de pays (valeur) en fonction de leur nom (cl�)

		HashMap<String, Pays> map = new HashMap<String, Pays>();
		map.put("USA", new Pays("USA", 327167434, 55805.204));
		map.put("France", new Pays("France", 67795000, 42878));
		map.put("Italie", new Pays("Italie", 60483973, 29866.0));
		map.put("UK", new Pays("Uk", 65105246, 43770.69));
		map.put("Allemagne", new Pays("Allemagne", 83019200, 47589.97));
		map.put("Japon", new Pays("Japon", 126330302, 39058.5));
		map.put("Russie", new Pays("Russie", 146780700, 11099.2));
		map.put("Chine", new Pays("Chine", 1417913092, 19392.36));
		map.put("Inde", new Pays("Inde", 1296834042, 1626.98));
		
		//Recherchez et supprimez le pays qui a le moins d�habitants
		long nbrMin= Long.MAX_VALUE;
		
		Iterator<Pays> iterator = map.values().iterator();
		while(iterator.hasNext()){
			Pays pays = iterator.next();
			if(pays.getNbHab()< nbrMin){
				nbrMin = pays.getNbHab();
				iterator.remove();
			}
			}
				System.out.println(map);
	}

}
