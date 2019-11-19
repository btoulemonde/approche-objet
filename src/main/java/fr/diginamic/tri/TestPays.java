package fr.diginamic.tri;
/*
 * Implémentez la méthode compareTo de manière à ce que le tri se fasse sur le nom du pays (par ordre alphabétique)
• Creez une ArrayList et remplissez là avec l’ensemble des pays du TP précédent
• Triez la liste
• Affichez le résultat afin de vérifier que les pays sont bien triés dans l’ordre alphabétique.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import fr.diginamic.tri.Pays;

public class TestPays {
	public static void main(String[] args) {
	List<Pays> pays = new ArrayList<>();

	pays.add(new Pays("USA", 327167434, 55805.204));
	pays.add(new Pays("France", 67795000, 42878));
	pays.add(new Pays("Allemagne", 83019200, 47589.97));
	pays.add(new Pays("Uk", 65105246, 43770.69));
	pays.add(new Pays("Italie", 60483973, 29866.0));
	pays.add(new Pays("Japon", 126330302, 39058.5));
	pays.add(new Pays("Russie", 146780700, 11099.2));
	pays.add(new Pays("Chine", 1417913092, 19392.36));
	pays.add(new Pays("Inde", 1296834042, 1626.98));
	
	//copareTo alpahbétique
	Collections.sort(pays);
	System.out.println(pays);
	}
}
