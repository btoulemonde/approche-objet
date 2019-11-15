package fr.diginamic.oerations;

public class CalculMoyenne {

	private double[] tableau;

	// constructeur tableau longueur initiale
	public CalculMoyenne() {
		this.tableau = new double[0];
	}

	// méthode pour agrandir le tableau et ajouter un valeur
	public void ajout(double ajoutNbr) {

		double[] tabTemp = new double[tableau.length + 1];
		for (int i = 0; i < tableau.length; i++) {
			tabTemp[i] = tableau[i];
		}
		
		tabTemp[tabTemp.length - 1] = ajoutNbr;
		this.tableau= tabTemp;

	}

	// methode de calcul de la moyenne des valeurs du tableau
	public double calcul() {
		double somme = 0.0;
		for (int i = 0; i < this.tableau.length; i++) {
			somme += this.tableau[i];
		}
		return (somme / this.tableau.length);
	}

}
