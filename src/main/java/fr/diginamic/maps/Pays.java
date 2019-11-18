package fr.diginamic.maps;

import java.util.Set;


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
			return "Pays [nom=" + nom + ", nbHab=" + nbHab + ", pIBHab=" + pIBHab + "]";
		}
		

		

	

}
