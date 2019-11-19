package fr.diginamic.tri;




public class Pays implements Comparable<Pays> {

	
		private String nom;
		private int nbHab;
		private int pIBHab;
		public Pays(String nom, int nbHab, int pIBHab) {
			this.nom = nom;
			this.nbHab = nbHab;
			this.pIBHab = pIBHab;
		}
		@Override
		public String toString() {
			return " [" + nom + ", nbHab=" + nbHab + ", pIBHab=" + pIBHab + "]";
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
		public void setNbHab(int nbHab) {
			this.nbHab = nbHab;
		}
		public double getpIBHab() {
			return pIBHab;
		}
		public void setpIBHab(int pIBHab) {
			this.pIBHab = pIBHab;
		}
		
		
		@Override
		public int compareTo(Pays p) {
			int result = this.nom.compareTo(p.getNom());
			return  result;
		}
		
	
	

}
