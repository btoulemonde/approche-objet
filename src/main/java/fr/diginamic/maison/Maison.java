package fr.diginamic.maison;

public class Maison {

	private Piece[] tab;

	public Maison() {
		tab = new Piece[0];
	}

	// méthode pour ajouter un pièce à la maison
	public void ajoutPiece(Piece nouvellePiece) {

		// conditions pour ajouer pieces
		if (nouvellePiece == null || nouvellePiece.getSuperficie() < 0 || nouvellePiece.getEtage() < 0) {
			System.out.println("la nouvelle pièce n'est pas valide");
			return;
		}
		Piece[] tabTemp = new Piece[tab.length + 1];
		for (int i = 0; i < tab.length; i++) {
			tabTemp[i] = tab[i];
		}
		tabTemp[tabTemp.length - 1] = nouvellePiece;
		this.tab = tabTemp;

	}

	// calcul de la surface totale de la maion

	public double superficieTolale() {
		double sommeSuperficie = 0.0;
		for (int i = 0; i < this.tab.length; i++) {
			sommeSuperficie += this.tab[i].getSuperficie();
		}
		return sommeSuperficie;
	}

	public double superficieEtage(int choixEtage) {
		double sommeEtage = 0;
		for (int i = 0; i < tab.length; i++) {
			if (choixEtage == tab[i].getEtage())
				sommeEtage += this.tab[i].getSuperficie();
		}
		return sommeEtage;
	}

	// méthode pour calculer surface par type de pièce
	public double superficiePiece(String type) {
		double sommePiece = 0;
		for (int i = 0; i < tab.length; i++) {
			if (type.equals(this.tab[i].typePiece())) {
				sommePiece += this.tab[i].getSuperficie();

			}
		}
		return sommePiece;
	}

	// méthode nbr de piece par type

	public int nombreTypePiece(String type) {
		int nbPiece = 0;
		for (int i = 0; i < tab.length; i++) {
			if (type.equals(this.tab[i].typePiece())) {
				nbPiece += 1;
			}
		}
		return nbPiece;
	}

}
