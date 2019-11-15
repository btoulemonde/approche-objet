package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;


/*
 * 
o cette classe a un m�thode de classe qui prend en param�tre un double et retourne un Cercle
� dans la classe TestCercle, faites appel � la m�thode static de CercleFactory pour cr�er vos cercles.
� PRECISION : en POO, on appelle Factory une classe qui en construit une autre. Il existe aussi le concept de Builder.
 */

public class CercleFactory {


	public static Cercle cercle(double rayon) {

		Cercle c = new Cercle(rayon);
		return c;
	}
}
