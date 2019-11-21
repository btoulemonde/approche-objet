package fr.diginamic.testexceptions;

public class Operation {

	// m�thode diviser
	public static double diviser(double a, double b) throws DenominateurNul {
		if (b == 0) {
			throw new DenominateurNul("Le dénominateur ne peut pas être nul");
		}
		return a / b;
	}
	
	//m�thode static diviserRuntime
	public static double diviserRuntime(double a, double b){
		if (b == 0) {
			throw new DenominateurNulRuntime("Le dénominateur ne peut pas être nul");
		}
		return a / b;
	}
	
}
