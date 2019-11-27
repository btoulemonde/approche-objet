package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		String chaine = "ETE";
		
		for(Saison s:Saison.values()){
			System.out.println(s);
			
		}
		
		System.out.println(Saison.valueOf(chaine).getNom());
		System.out.println(Saison.valueOf(chaine).getOrdre());
		
		System.out.println(Saison.getSaison(4).getNom()+" "+Saison.getSaison(4).getOrdre());
		
		
	}

}
