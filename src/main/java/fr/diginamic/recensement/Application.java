package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import fr.diginamic.recensement.Ville;

import org.apache.commons.io.FileUtils;

public class Application {

	public static void main(String[] args) {
		
		//liste villes
		List<Ville> villes = new ArrayList<Ville>();
		List<String> lignes = new ArrayList<>();
		try {
			File file = new File("C:/work/recensement population 2016.csv");
			lignes = FileUtils.readLines(file, "UTF-8");

			//suppression premi�re ligne du tableur
			lignes.remove(0);
			
			for (String ligne : lignes) {
				String[] morceaux = ligne.split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String nomCommune = morceaux[5];
				int population = Integer.parseInt(morceaux[6].replace(" ", "").trim());
				
				// On cree maintenant la ville avec toutes ses donn�es
				Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, nomCommune, population);
			
				//ajout a la liste
				villes.add(ville);
			}
			
			
			System.out.println("Nombre de lignes: " + lignes.size());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		//rechercher et affiche montpellier + infos
		for (Ville a : villes){
			if(a.getNomCommune().equals("Montpellier")){
				System.out.println(a);
			}
		}
		//afficher population herault
		int populationDepartement = 0;
		for (Ville a : villes){
			if(a.getCodeDepartement().equals("34")){
				populationDepartement += a.getPopulation();
			
			}
		}
		System.out.println("Population totale du d�partement de l'H�rault: "+ populationDepartement+"habitants");
		
		//afficher la plus petite ville du departement de l'h�rault
		int popMin = Integer.MAX_VALUE;
		String villeMin =null;
		for (Ville a: villes){
			if (a.getCodeDepartement().equals("34") && a.getPopulation()<popMin){
				popMin = a.getPopulation();
				villeMin = a.getNomCommune();
			}
		}
		System.out.println("La ville la plus petite de l'h�rault est: "+ villeMin + "avec " + popMin +" habitants.");
		
		//creation d'une liste contenant uniquement les villes de l'herault
		List<Ville> villesHerault = new ArrayList<>();
		for(Ville a : villes){
			if (a.getCodeDepartement().equals("34")){
				villesHerault.add(a);
			}
		}
		
		
		//10 plus petites villes du d�partement
		Collections.sort(villesHerault,new ComparatorVillePopulationCroissante());
		
		System.out.println("\nLes 10 plus petites villes de l'h�rault sont: ");
		for (int i = 0; i<10; i++){
			System.out.println(villesHerault.get(i));
		}
		
		//10 plus grandes villes du d�partement
				Collections.sort(villesHerault,new ComparatorVillePopulationDecroissante());
				System.out.println("\nLes 10 plus grandes villes de l'h�rault sont: ");
				for (int i = 0; i<10; i++){
					System.out.println(villesHerault.get(i));
				}
	}

}
