package fr.diginamic.entites;

public class Debit extends Operation {

	public Debit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
	}
	
	public String afficherType() {
		return "débit";
	}
}
