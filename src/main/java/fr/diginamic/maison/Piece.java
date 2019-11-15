package fr.diginamic.maison;

public abstract class Piece {
	protected double superficie;
	protected int etage;
	
	
	//constructeur 
	public Piece( double superficie, int etage) {
		this.superficie = superficie;
		this.etage = etage;
	}
	public abstract String typePiece();

	/**
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}


	/**
	 * @param etage the etage to set
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}


	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}


	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	
	

}
