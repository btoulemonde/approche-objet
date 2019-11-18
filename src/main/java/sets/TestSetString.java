package sets;

import java.util.HashSet;
import java.util.Set;

/*
 
• Dans cette classe instanciez un HashSet de String contenant les éléments suivants :
o USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde
• Recherchez le pays dans cette liste qui a le plus grand nombre de lettres
• Supprimez ce pays
• Affichez enfin le contenu de la collection ainsi modifiée
 */

public class TestSetString {

	public static void main(String[] args) {
	
		
		Set<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		//supp pays le plus long
		int maxLettres = 0;
		String paysLong = "";
		for(String pays : set){
			if(pays.length()>maxLettres){
				maxLettres = pays.length();
				paysLong = pays;
			}
		
		}
		set.remove(paysLong);
		System.out.println(set);
	
		
		
		

	}

}
