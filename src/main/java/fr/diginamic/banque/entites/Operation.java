package fr.diginamic.banque.entites;

public abstract class Operation {
	private String dateOperation;
	private double montantOperation;
	
	//methode pour retourner le type d'operation
	public abstract String afficherType();
	
	public void annoncerType(){
		System.out.println(afficherType());
	}
	
	//constructeur
	public Operation(String dateOperation, double montantOperation) {
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}
	
	// methode toString 
	public String toString(){
		return dateOperation + " " + montantOperation + " "+ afficherType();
	}
	/**
	 * @return the dateOperation
	 */
	public String getDateOperation() {
		return dateOperation;
	}
	/**
	 * @param dateOperation the dateOperation to set
	 */
	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}
	/**
	 * @return the montantOperation
	 */
	public double getMontantOperation() {
		return montantOperation;
	}
	/**
	 * @param montantOperation the montantOperation to set
	 */
	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}

}
