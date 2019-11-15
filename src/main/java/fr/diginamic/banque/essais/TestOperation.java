package fr.diginamic.banque.essais;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {

		Operation[] operations = new Operation[4];
		operations[0] = new Credit("14/11/2019", 100.5);
		operations[1] = new Credit("10/11/2019", 120.0);
		operations[2] = new Debit("10/10/2019", 20.5);
		operations[3] = new Debit("18/10/2019", 200.);

		double soldeGlobal = 0.0;
		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i]);
			if (operations[i].afficherType().equals("crédit")) {
				soldeGlobal += operations[i].getMontantOperation();
			} else {
				soldeGlobal -= operations[i].getMontantOperation();
			}

		}
		System.out.println("solde global: " + soldeGlobal);
	}

}
