package sets;

import java.util.HashSet;
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
public class Pays {

	
		private String nom;
		private long nbHab;
		private double pIBHab;
		public Pays(String nom, long nbHab, double pIBHab) {
			this.nom = nom;
			this.nbHab = nbHab;
			this.pIBHab = pIBHab;
		}
		@Override
		public String toString() {
			return " [Pays=" + nom + ", nbHab=" + nbHab + ", pIBHab=" + pIBHab + "]";
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public long getNbHab() {
			return nbHab;
		}
		public void setNbHab(long nbHab) {
			this.nbHab = nbHab;
		}
		public double getpIBHab() {
			return pIBHab;
		}
		public void setpIBHab(double pIBHab) {
			this.pIBHab = pIBHab;
		}
		

		

	

}
