package fr.diginamic.recensement.difficile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import fr.diginamic.recensement.difficile.service.PopulationDepartement;
import fr.diginamic.recensement.difficile.service.PopulationVille;
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

		System.out.println("MENU:");
		System.out.println("1: Afficher la population d'une ville");
		System.out.println("2: Afficher la population d'un département");
		System.out.println("3: Afficher la population d'une Région");
		String choixUser = scanner.nextLine();
		int choix = Integer.parseInt(choixUser);

		switch (choix) {
		case 1:
			PopulationVille populationVille = new PopulationVille();
			populationVille.traiter(recensement, scanner);
			break;
		case 2:
			PopulationDepartement populationDepartement = new PopulationDepartement();
			populationDepartement.traiter(recensement, scanner);
			break;
		}

	}
}
