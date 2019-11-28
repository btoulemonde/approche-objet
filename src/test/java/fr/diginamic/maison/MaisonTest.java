package fr.diginamic.maison;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaisonTest {

	Maison m = new Maison();
	
	@Test
	public void testAjoutPiece() {
		Piece ch = new Chambre(20, 0);
		m.ajoutPiece(ch);
		assertEquals(1, m.getTab().length);
	}
		
	
	@Test
	public void testSuperficieTolale() {
		Piece ch = new Chambre(20, 0);
		Piece ch2 = new Chambre(20,1);
		Piece wc = new WC (2,0);
		m.ajoutPiece(ch);
		m.ajoutPiece(ch2);
		m.ajoutPiece(wc);
		assertEquals(0.000001,42, m.superficieTolale());

	}

	@Test
	public void testSuperficieEtage() {
		Piece ch = new Chambre(20, 0);
		Piece ch2 = new Chambre(20,1);
		Piece wc = new WC (2,0);
		m.ajoutPiece(ch);
		m.ajoutPiece(ch2);
		m.ajoutPiece(wc);
		assertEquals(0.000001,22.0, m.superficieEtage(0));
	}

	@Test
	public void testSuperficiePiece() {
			Piece ch = new Chambre(20, 0);
			Piece ch2 = new Chambre(20,1);
			Piece wc = new WC (2,0);
			m.ajoutPiece(ch);
			m.ajoutPiece(ch2);
			m.ajoutPiece(wc);
			assertEquals(0.000001,40.0, m.superficiePiece("Chambres"));
	}

	@Test
	public void testNombreTypePiece() {
			Piece ch = new Chambre(20, 0);
			Piece ch2 = new Chambre(20,1);
			Piece wc = new WC (2,0);
			m.ajoutPiece(ch);
			m.ajoutPiece(ch2);
			m.ajoutPiece(wc);
			assertEquals(2, m.nombreTypePiece("Chambres"));
	}
	

}
