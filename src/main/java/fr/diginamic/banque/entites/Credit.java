package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
	}

	public String afficherType() {
		return "crédit";
	}

}
