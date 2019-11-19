package fr.diginamic.recensement;

import java.util.Comparator;
import fr.diginamic.recensement.Ville;

public class ComparatorVillePopulationDecroissante implements Comparator<Ville> {

	@Override
	public int compare(Ville v1, Ville v2) {
		if (v1.getPopulation()<v2.getPopulation()){
			return 1;
		}else if(v1.getPopulation()>v2.getPopulation()){
			return -1;
		}
		return 0;
	}

}
