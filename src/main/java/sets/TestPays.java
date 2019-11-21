package sets;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import sets.Pays;

/*
 * Cr�ez une classe Pays poss�dant 3 attributs : nom, nb d�habitants, PIB/habitant.
� Cr�ez un HashSet de pays contenant les pays suivants avec les informations correctes de nombre d�habitants et de PIB/Hab:
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
� Recherchez le pays avec le PIB/habitant le plus important
� Recherchez le pays avec le PIB total le plus important
� Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
� Supprimez le pays dont le PIB total est le plus petit
� Affichez l�ensemble des pays ainsi modifi�s avec leur nom, nombre d�habitants et PIB total
 */
public class TestPays {

	public static void main(String[] args) {

		Set<Pays> set = new HashSet<>();

		set.add(new Pays("USA", 327167434, 55805.204));
		set.add(new Pays("France", 67795000, 42878));
		set.add(new Pays("Allemagne", 83019200, 47589.97));
		set.add(new Pays("Uk", 65105246, 43770.69));
		set.add(new Pays("Italie", 60483973, 29866.0));
		set.add(new Pays("Japon", 126330302, 39058.5));
		set.add(new Pays("Russie", 146780700, 11099.2));
		set.add(new Pays("Chine", 1417913092, 19392.36));
		set.add(new Pays("Inde", 1296834042, 1626.98));

		// pib/hab max
		double pibMax = 0.0;
		String paysPIBMax = null;
		Iterator<Pays> ite = set.iterator();
		while (ite.hasNext()) {
			Pays pays = ite.next();
			if (pays.getpIBHab() > pibMax) {
				pibMax = pays.getpIBHab();
				paysPIBMax = pays.getNom();

			}
		}
		System.out.println(
				"le pays qui a le plus grand PIB/hab est: " + paysPIBMax + " avec un PIB/hab de : " + pibMax + " $");

		// pib total le plus important
		
		double pibTotalMax = 0.0;
		String paysPIBTotalMax = null;
		Iterator<Pays> ite2 = set.iterator();
		while(ite2.hasNext()){
			Pays pays2 = ite2.next();
			if (pays2.pibTotal(pays2.getNbHab(), pays2.getpIBHab())> pibTotalMax){
				pibTotalMax = pays2.pibTotal(pays2.getNbHab(), pays2.getpIBHab());
				paysPIBTotalMax = pays2.getNom();
			}
		}
		System.out.println("pays avec le pib total max: " + paysPIBTotalMax);
		
		// pib total le moins important
		
				double pibTotalMin = pibTotalMax;
				String paysPIBTotalMin = null;
				Iterator<Pays> ite3 = set.iterator();
				while(ite3.hasNext()){
					Pays pays3 = ite3.next();
					if (pays3.pibTotal(pays3.getNbHab(), pays3.getpIBHab())< pibTotalMin){
						pibTotalMin = pays3.pibTotal(pays3.getNbHab(), pays3.getpIBHab());
						paysPIBTotalMin = pays3.getNom().toUpperCase();
						ite3.remove();
					}
				}
				System.out.println("pays avec le pib total min: " + paysPIBTotalMin);
				
				
				
				System.out.println(set);
	}

}
