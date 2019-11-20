package fr.diginamic.testexceptions;

public class Operation {

	// méthode diviser
	public static double diviser(double a, double b) throws DenominateurNul {
		if (b == 0) {
			throw new DenominateurNul("Le dénominateur ne peut pas être nul");
		}
		return a / b;
	}
}
