package fr.diginamic.recensement.difficile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class LectureFichier {

	public static void main(String[] args) {
		List<String> lignes = new ArrayList<String>();
		try{
		File file = new File("C:/work/recensement.csv");
		lignes = FileUtils.readLines(file, "UTF-8");
		}catch (IOException e){
			System.out.println(e.getMessage());
		}
	}

}
