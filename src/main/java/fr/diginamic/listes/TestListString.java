package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.text.html.HTMLDocument.Iterator;

/*
 * Dans cette classe instanciez une ArrayList de String contenant les �l�ments suivants :
o Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes
� Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
� Modifiez le contenu de la liste de mani�re � mettre tous les noms de villes en majuscules.
� Supprimez de la liste les villes dont le nom commence par la lettre N.
� Affichez la liste r�sultante
 */

public class TestListString {
	public static void main(String[] args) {
		
		
		List <String> liste = new ArrayList<>();
		liste.add("Nice");
		liste.add("Carcasonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");
		
		//ville la plus longue
		int maxLettres = 0;
		String villeLongue = " ";
		for(String ville : liste){
			if(ville.length()>maxLettres){
				maxLettres = ville.length();
				villeLongue = ville;
			}
		}
		System.out.println(villeLongue);
		
		//nom en majuscule
		List <String> liste2 = new ArrayList<>();
		for (String ville : liste){
			liste2.add(ville.toUpperCase());
			
		}
				
		System.out.println(liste2);
		
	//supprimer les villes commencant par N
		for(int i = 0; i<liste.size();i++) {
			if(liste.get(i).subSequence(0, 1).equals("N")) {
				liste.remove(i);
			}
		}
		
		System.out.println(liste);
			
		
		
		
		
	}

}
