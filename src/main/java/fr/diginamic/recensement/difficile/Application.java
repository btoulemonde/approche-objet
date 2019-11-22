package fr.diginamic.recensement.difficile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import fr.diginamic.recensement.difficile.service.PopulationDepartement;
import fr.diginamic.recensement.difficile.service.PopulationRegion;
import fr.diginamic.recensement.difficile.service.PopulationVille;
import fr.diginamic.recensement.difficile.service.Top10DepartementPopulation;
import fr.diginamic.recensement.difficile.service.Top10RégionPopulation;
import fr.diginamic.recensement.difficile.service.Top10VillesDepartement;
import fr.diginamic.recensement.difficile.service.Top10VillesFrance;
import fr.diginamic.recensement.difficile.service.Top10VillesRegion;
import fr.diginamic.recensement.facile.Ville;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Recensement recensement = new Recensement();

		List<String> lignes = new ArrayList<>();
		try {
			File file = new File("C:/work/recensement population 2016.csv");
			lignes = FileUtils.readLines(file, "UTF-8");

			// suppression première ligne du tableur
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

				// ajout a la liste
				recensement.getVilles().add(ville);

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(" ____________________________MENU_____________________________");
		System.out.println("|1: Afficher la population d'une ville                        |");
		System.out.println("|2: Afficher la population d'un département                   |");
		System.out.println("|3: Afficher la population d'une Région                       |");
		System.out.println("|4: Afficher les 10 régions les plus peuplées                 |");
		System.out.println("|5: Afficher les 10 départements les plus peuplés             |");
		System.out.println("|6: Afficher les 10 villes les plus peuplées d'un département |");
		System.out.println("|7: Afficher les 10 villes les plus peuplées d'une région     |");
		System.out.println("|8: Afficher les 10 villes les plus peuplées de France        |");
		System.out.println("|9: Sortir                                                    |");
		System.out.println("|_____________________________________________________________|");
		String choixUser = scanner.nextLine();
		int choix = Integer.parseInt(choixUser);
		
	
		while (choix != 9) {
			switch (choix) {
			case 1:
				PopulationVille populationVille = new PopulationVille();
				populationVille.traiter(recensement, scanner);
				break;
			case 2:
				PopulationDepartement populationDepartement = new PopulationDepartement();
				populationDepartement.traiter(recensement, scanner);
				break;
			case 3:
				PopulationRegion populationRegion = new PopulationRegion();
				populationRegion.traiter(recensement, scanner);
				break;
			case 4:
				Top10RégionPopulation top10Region = new Top10RégionPopulation();
				top10Region.traiter(recensement);
				break;
			case 5:
				Top10DepartementPopulation top10Departement = new Top10DepartementPopulation();
				top10Departement.traiter(recensement);
				break;
			case 6:
				Top10VillesDepartement top10VillesDepartement = new Top10VillesDepartement();
				top10VillesDepartement.traiter(recensement, scanner);
				break;
			case 7:
				Top10VillesRegion top10VillesRegion = new Top10VillesRegion();
				top10VillesRegion.traiter(recensement, scanner);
				break;
			case 8:
				Top10VillesFrance top10VillesFrance = new Top10VillesFrance();
				top10VillesFrance.traiter(recensement, scanner);
				break;
			}

		}

	}
}
