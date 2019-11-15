package fr.diginamic.essais;

import fr.diginamic.entites.Compte;
import fr.diginamic.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
	

		Compte[] comptes = new Compte[2];

		comptes[0]=new Compte("12A",150.0);
		comptes[1]=new CompteTaux("12A",250.0,1.5);
		
		for (int i = 0;i<comptes.length; i++){
			System.out.println(comptes[i]);
		}
	}

	

}
