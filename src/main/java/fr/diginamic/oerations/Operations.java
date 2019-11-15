package fr.diginamic.oerations;

/*
 * Dans ce package créez une classe Operations
o cette classe a une méthode static calcul qui prend en paramètre 2 double a et b et un opérateur qui est de type char.
o Si l’opérateur vaut ‘+’ alors la méthode calcul retourne a+b
o Si l’opérateur vaut ‘-‘ alors la méthode calcul retourne a-b
o Faites la même chose pour les opérateurs *et /
• Creez un package fr.diginamic.essais
2
• Dans ce package, creez une classe TestOperations qui permet de tester les 4 opérations.
 */

public class Operations {
	

	public static double calcul(double a, double b, char operateur) {
		double resultat = 0;
		if (operateur == '+') {
			return a + b;
		} else if (operateur == '-') {
			return a - b;
		} else if (operateur == '*') {
			return a * b;
		} else if (operateur == '/'){
			return a / b;
		}
		return resultat;

	}
	
	
}
