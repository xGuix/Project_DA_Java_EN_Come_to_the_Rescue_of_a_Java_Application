package com.hemebiotech.analytics;

/**
 * <b>La class AnalyticsCounter appelle l'objet {ObjAnalyser}</b> {@link ObjAnalyser}
 * <p>
 *  3 methodes de l'objet {@link ObjAnalyser} appellées pour traiter les fichiers :
 * <ul>
 * <li> METHODE DE LECTURE DE FICHIER //
 * {@link ObjAnalyser#getSymptomsList()}
 * <li> METHODE DE COMPTAGE DE LISTE //
 * {@link ObjAnalyser#getCountedList()}
 * <li> METHODE D'ECRITURE DE FICHIER //
 * {@link ObjAnalyser#getWritedList()}
 * </ul>
 * <p>
 * 
 * @see ISymptomReader
 * @see ISymptomCounter
 * @see ISymptomWriter
 *
 * @author xGuix
 * @version v1.0
 */

public class AnalyticsCounter
{
	/**
	 * <b>Déclaration du fichier d'entrée inputFile ("symptoms.txt") et de sortie outputFile ("result.out")</b>
	 * <p>
	 * Instance de l'objet {@link ObjAnalyser} nommée (MyAnalyser)<br>
	 * Instance des 3 implementations.
	 * </p>
	 * Appel les 3 methodes qui appellent les 3 implementations :
	 * <ul>
	 * <li>	 .getSymptomsList() {@link ObjAnalyser#getSymptomsList()}
	 * <li>	 .getCountedList() {@link ObjAnalyser#getCountedList()}
	 * <li>	 .getWritedList() {@link ObjAnalyser#getWritedList()}
	 * </ul>
	 *
	 * @param args empty
	 * @throws Exception Try / catch
	 */

	public static void main(String args[]) throws Exception
	{
		// Déclare le nom des fichiers in et out
		final String inputFile = "symptoms.txt";
		final String outputFile = "result.out";
		// Instance de class Objet {ObjAnalyser} avec les valeurs de mes class (ReadSymptomDataFromFile , CountSymptomDataFromFile et WriteSymptomDataToFile)
		ObjAnalyser MyAnalyser = new ObjAnalyser(new ReadSymptomDataFromFile(inputFile),
		new CountSymptomDataFromList(), new WriteSymptomDataToFile(outputFile));
			// Appelle de methode pour obtenir la liste des symptoms du fichier "symptoms.txt"
			MyAnalyser.getSymptomsList();
		    // Appelle de methodes pour compter les symptoms
		    MyAnalyser.getCountedList();
		    // Appelle de methode pour ecrire le resultat dans le fichier "result.out"
		    MyAnalyser.getWritedList();
		    System.out.println("The new file : result.out is now add to your folder!");
		    System.out.println("Thanks for using AnalyticsCounter v1.0");
	}
}