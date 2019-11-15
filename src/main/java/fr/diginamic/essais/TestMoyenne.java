package fr.diginamic.essais;

import fr.diginamic.oerations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne calculMoyenne = new CalculMoyenne();

		calculMoyenne.ajout(5.0);
		calculMoyenne.ajout(10.0);
		calculMoyenne.ajout(2.0);
		calculMoyenne.ajout(56.8);



		

		
		
		System.out.println("moyenne = "+ calculMoyenne.calcul());
	}
	
		

}
