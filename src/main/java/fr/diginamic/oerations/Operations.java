package fr.diginamic.oerations;

/*
 * Dans ce package cr�ez une classe Operations
o cette classe a une m�thode static calcul qui prend en param�tre 2 double a et b et un op�rateur qui est de type char.
o Si l�op�rateur vaut �+� alors la m�thode calcul retourne a+b
o Si l�op�rateur vaut �-� alors la m�thode calcul retourne a-b
o Faites la m�me chose pour les op�rateurs *et /
� Creez un package fr.diginamic.essais
2
� Dans ce package, creez une classe TestOperations qui permet de tester les 4 op�rations.
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
