package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;



public class TestSetDouble {

	public static void main(String[] args) {
	
		Set<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		//afficher tous les elements
		System.out.println(set);
		
		// affichage de l'element le plus petit
		Object min = Collections.min(set);
		System.out.println("élément le plus petit: "+min);
		
		//élément le plus grand
		Object max = Collections.max(set);
		System.out.println("élément le plus grand: "+max);
		
		//supprimer l'élément le plus petit
		set.remove(min);
		System.out.println("set sans le plus petit élément: "+set);
	}

}
