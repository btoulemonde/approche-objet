package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays p1, Pays p2) {
		if (p1.getpIBHab()>p2.getpIBHab()){
			return 1;
		}else if (p1.getpIBHab()<p2.getpIBHab()){
			return -1;
		}
		return 0;
	}

}
