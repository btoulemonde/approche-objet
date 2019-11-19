package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

			//suppression première ligne du tableur
			lignes.remove(0);
			
			for (String ligne : lignes) {
				String[] morceaux = ligne.split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String nomCommune = morceaux[5];
				int population = Integer.parseInt(morceaux[6].replace(" ", "").trim());
				
				// On cree maintenant la ville avec toutes ses données
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
	}

}
