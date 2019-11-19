package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	// tri nombre d'habitatns
	public int compare(Pays p1, Pays p2) {
		if (p1.getNbHab()>p2.getNbHab()){
			return 1;
		}else if (p1.getNbHab()<p2.getNbHab()){
			return -1;
		}
		return 0;
	}

}
