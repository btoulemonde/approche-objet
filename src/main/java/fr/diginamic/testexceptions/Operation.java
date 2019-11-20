package fr.diginamic.testexceptions;

public class Operation {

	// m�thode diviser
	public static double diviser(double a, double b) throws DenominateurNul {
		if (b == 0) {
			throw new DenominateurNul("Le d�nominateur ne peut pas �tre nul");
		}
		return a / b;
	}
	
	//m�thode static diviserRuntime
	public static double diviserRuntime(double a, double b){
		if (b == 0) {
			throw new DenominateurNulRuntime("Le d�nominateur ne peut pas �tre nul");
		}
		return a / b;
	}
	
}
