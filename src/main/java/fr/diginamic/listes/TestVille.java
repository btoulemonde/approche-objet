package fr.diginamic.listes;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

/*
 * o Nice, 343 000 hab.
o Carcassonne, 47 800 hab.
o Narbonne, 53 400 hab.
o Lyon, 484 000 hab.
o Foix, 9 700 hab.
o Pau, 77 200 hab.
o Marseille, 850 700 hab.
o Tarbes, 40 600 hab.
� Recherchez et affichez la ville la plus peupl�e
� Supprimez la ville la moins peupl�e
 */
public abstract class TestVille {

	public static void main(String[] args) {
		List<Ville> liste = new ArrayList<>();
		liste.add(new Ville("Nice", 343000));
		liste.add(new Ville("Carcasonne", 47800));
		liste.add(new Ville("Lyon", 484000));
		liste.add(new Ville("Narbonne", 53400));
		liste.add(new Ville("Foix", 9700));
		liste.add(new Ville("Pau", 77200));
		liste.add(new Ville("Marseille", 850700));
		liste.add(new Ville("Tarbes", 40600));
		
		
		int nbrMax = 0;
		Ville villeMax = null;
		Iterator<Ville> iterator = liste.iterator();
		while (iterator.hasNext()) {
			Ville ville = iterator.next();
			if (ville.getNbrHab() > nbrMax) {
				villeMax = ville;
				nbrMax = ville.getNbrHab();
			}
		}
		System.out.println("La ville ayant le plus gand nombre d'habitants est: " + villeMax);

		// supp la ville la moins peupl�e
		int nbrMin = nbrMax;
		
		Iterator<Ville> iter = liste.iterator();
		while (iter.hasNext()) {
			Ville ville2 = iter.next();
			if (ville2.getNbrHab() < nbrMin) {
				nbrMin = ville2.getNbrHab();
				iter.remove();
			}
			
;
		}
		System.out.println(liste);
	}

}
