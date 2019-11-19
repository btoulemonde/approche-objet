package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class TestListInt {

	public static void main(String[] args) {
		List<Integer> liste = new ArrayList<>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);

		System.out.println(liste);
		System.out.println("longueur de la liste: " + liste.size());
	
		// afficher valeur max
		int max = 0;
		for (Integer a : liste) {
			if (a > max) {
				max = a;
			}
		}
		System.out.println("nombre max: " + max);

		
		//supprimer le plus petit element
		 Object valMin = Collections.min(liste);
		liste.remove(valMin);
		 System.out.println("liste - min "+liste);
		// elements neg
		 
		for (int i =0; i<liste.size(); i++) {
			if (liste.get(i)<0) {
				liste.set(i, (-liste.get(i)));

			}
			
		}
		System.out.println("liste sans neg "+liste);
	}
}
