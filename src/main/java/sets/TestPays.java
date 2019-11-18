package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Créez une classe Pays possédant 3 attributs : nom, nb d’habitants, PIB/habitant.
• Créez un HashSet de pays contenant les pays suivants avec les informations correctes de nombre d’habitants et de PIB/Hab:
o USA
o France.
o Allemagne.
o UK.
o Italie.
2
o Japon.
o Chine.
o Russie.
o Inde
• Recherchez le pays avec le PIB/habitant le plus important
• Recherchez le pays avec le PIB total le plus important
• Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
• Supprimez le pays dont le PIB total est le plus petit
• Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB total
 */
public class TestPays {

	public static void main(String[] args) {
		

		Set<Pays> set = new HashSet<>();
		
		set.add(new Pays("USA", 80000000, 50000.0));
		set.add(new Pays("France", 60000000, 45000.0));
		set.add(new Pays("Allemagne", 70000000, 48000.0));
		set.add(new Pays("UK", 50000000, 43000.0));
		
		
			
		
		
		
		
		
		
		
		

	}

}
