package fr.diginamic.chaines;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;012543;1 523.5";

		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère : " + premierCaractere);

		int longueurCaractere = chaine.length();
		System.out.println("longueur chaine de caractère : " + longueurCaractere);

		int indexCaractere = chaine.indexOf(";");
		System.out.println("index premier ; : " + indexCaractere);

		String nomClient = chaine.substring(0, chaine.indexOf(";"));
		System.out.println("Nom : " + nomClient.toUpperCase());
		System.out.println("Nom : " + nomClient.toLowerCase());

		String[] tab = chaine.split(";");

		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
		String solde = tab[3].replace(" ", "");
		System.out.println(solde);
		
		Compte client1 = new Compte(tab[0], tab[1], tab[2], solde);
		System.out.println(client1);
	}
	
	
}
