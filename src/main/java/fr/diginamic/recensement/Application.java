package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import fr.diginamic.recensement.Ville;
import fr.diginamic.recensement.Departement;

import org.apache.commons.io.FileUtils;

public class Application {

	public static void main(String[] args) {

		// liste villes
		List<Ville> villes = new ArrayList<Ville>();
		List<String> lignes = new ArrayList<>();
		try {
			File file = new File("C:/work/recensement population 2016.csv");
			lignes = FileUtils.readLines(file, "UTF-8");

			// suppression premi�re ligne du tableur
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

				// ajout a la liste
				villes.add(ville);
			}

			System.out.println("Nombre de lignes: " + lignes.size());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// rechercher et affiche montpellier + infos
		for (Ville a : villes) {
			if (a.getNomCommune().equals("Montpellier")) {
				System.out.println("\n" + a);
			}
		}
		// afficher population herault
		int populationHerault = 0;
		for (Ville a : villes) {
			if (a.getCodeDepartement().equals("34")) {
				populationHerault += a.getPopulation();

			}
		}
		System.out.println("\nPopulation totale du d�partement de l'H�rault: " + populationHerault + "habitants");

		// afficher la plus petite ville du departement de l'h�rault
		int popMin = Integer.MAX_VALUE;
		String villeMin = null;
		for (Ville a : villes) {
			if (a.getCodeDepartement().equals("34") && a.getPopulation() < popMin) {
				popMin = a.getPopulation();
				villeMin = a.getNomCommune();
			}
		}
		System.out
				.println("\nLa ville la plus petite de l'h�rault est: " + villeMin + "avec " + popMin + " habitants.");

		// creation d'une liste contenant uniquement les villes de l'herault
		List<Ville> villesHerault = new ArrayList<>();
		for (Ville a : villes) {
			if (a.getCodeDepartement().equals("34")) {
				villesHerault.add(a);
			}
		}

		// 10 plus petites villes du d�partement
		Collections.sort(villesHerault, new ComparatorVillePopulationCroissante());

		System.out.println("\nLes 10 plus petites villes de l'h�rault sont: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(villesHerault.get(i));
		}

		// 10 plus grandes villes du d�partement
		Collections.sort(villesHerault, new ComparatorVillePopulationDecroissante());
		System.out.println("\nLes 10 plus grandes villes de l'h�rault sont: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(villesHerault.get(i));
		}

		// population de la r�gion occitanie
		int populationOccitanie = 0;
		for (Ville a : villes) {
			if (a.getNomRegion().equals("Occitanie")) {
				populationOccitanie += a.getPopulation();
			}
		}
		System.out
				.println("\nLa population tatale de la r�gion Occitanie est de " + populationOccitanie + " habitatnts");

		// creation d'une liste contenant uniquement les villes de la r�gion occitanie
		List<Ville> villesOccitanie = new ArrayList<>();
		for (Ville a : villes) {
			if (a.getNomRegion().equals("Occitanie")) {
				villesOccitanie.add(a);
			}
		}
		
		// 10 plus grandes villes de la r�gion occitanie
		Collections.sort(villesOccitanie, new ComparatorVillePopulationDecroissante());
		System.out.println("\nLes 10 plus grandes villes de la r�gion Occitanie sont: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(villesOccitanie.get(i));
		}
		
		//---------------------------------------------------------------------------------
		//d�partement le plus peupl� de la r�gion Occitanie
		System.out.println("\nLe d�partement le plus peupl� de la r�gion Occitanie est: ");
		
		
		HashMap<String, Departement> mapDepts = new HashMap<>();
		for (Ville a : villes){
			
			//cherche toutes les villes de la r�gion
			if(a.getNomRegion().equals("Occitanie")){
				 //on recup departement de la r�gion
				String codeDept = a.getCodeDepartement();
				
				//puis on cherche dep stock� dans la map
				Departement dept = mapDepts.get(codeDept);
				
				//si dept precedent n'existe pas on le stock dans la map
				if(dept == null){
					dept = new Departement(a.getCodeDepartement());
					mapDepts.put(a.getCodeDepartement(), dept);
				}
				
				//on ajoute la pop de la ville du dep
				dept.setPopulation(dept.getPopulation()+a.getPopulation());
			}
		}
		
		//on recup les dept dans une liste
		ArrayList<Departement> listeDepts = new ArrayList<>();
		listeDepts.addAll(mapDepts.values());
		
		Collections.sort(listeDepts,new ComparatorDepartementPopulationDecroissante());
		for (int i = 0; i<1; i++){
			System.out.println(listeDepts.get(i));
		}
		
		
		//--------------------------------------------------------------------------------------------
		//Afficher les 10 r�gions les plus peupl� de France
		System.out.println("\nLes 10 r�gions les plus peupl�es de France sont: ");
		
		//creation map
		HashMap<String, Region> mapRegion = new HashMap<>();
		
		//on fait defiler les villes
		for (Ville a : villes){
			//on r�cup�re la r�gion
			String nomR�gion = a.getNomRegion();
			
			//on la cherche dans la map
			Region region = mapRegion.get(nomR�gion);
			
			 //si elle nexiste pas encore on l'integre dans la map
			if(region == null){
				region = new Region(a.getNomRegion());
				mapRegion.put(a.getNomRegion(), region);
			}
			// on ajoute la pop de la ville a la region
			region.setPopulation(region.getPopulation()+a.getPopulation());
		}
		
		//recupertion des regions dans une liste
		ArrayList<Region> listeRegion = new ArrayList<>();
		listeRegion.addAll(mapRegion.values());
		
		//on affiche les 10 regions les plus peuplees
		Collections.sort(listeRegion,new ComparatorRegionPopulationDecroissante());
		for(int i = 0; i<10; i++){
			System.out.println(listeRegion.get(i));
		}
		
		//--------------------------------------------------------------------------
		//Afficher les 10 departements les plus peupl� de France
				System.out.println("\nLes 10 d�partements les plus peupl�s de France sont: ");
				
				//creation map
				HashMap<String, Departement> mapDepartement = new HashMap<>();
				
				//on fait defiler les villes
				for (Ville a : villes){
					//on r�cup�re le dep
					String codeDepartement = a.getCodeDepartement();
					
					//on la cherche dans la map
					Departement departement = mapDepartement.get(codeDepartement);
					
					 //si elle nexiste pas encore on l'integre dans la map
					if(departement == null){
						departement = new Departement(a.getCodeDepartement());
						mapDepartement.put(a.getCodeDepartement(), departement);
					}
					// on ajoute la pop de la ville au dep
					departement.setPopulation(departement.getPopulation()+a.getPopulation());
				}
				
				//recupertion des dep dans une liste
				ArrayList<Departement> listeDepartement = new ArrayList<>();
				listeDepartement.addAll(mapDepartement.values());
				
				//on affiche les 10 d�partements les plus peuples
				Collections.sort(listeDepartement, new ComparatorDepartementPopulationDecroissante());
				for(int i = 0; i<10; i++){
					System.out.println(listeDepartement.get(i));
				}
				
			//-------------------------------------------------------------------------
			//afficher les 10 villes les plus peupl�es
				Collections.sort(villes, new ComparatorVillePopulationDecroissante());
				System.out.println("\nLes 10 plus grandes villes France sont: ");
				for (int i = 0; i < 10; i++) {
					System.out.println(villes.get(i));
				}	
				
	}
}

