package com.hemebiotech.analytics;

/**<p>
 * <b>La class AnalyticsCounter qui appelle l'objet {ObjAnalyser}</b> {@link ObjAnalyser}
 * </p>
 * Les 3 classes utilisees par l'objet pour traiter les fichiers :<br>
 * <ul>
 * <li> METHODE DE LECTURE DE FICHIER // 
 * {@link ReadSymptomDataFromFile} implement ISymptomReader
 * <li> METHODE DE COMPTAGE DE LISTE // 
 * {@link CountSymptomDataFromFile} implement ISymptomCounter
 * <li> METHODE D'ECRITURE DE FICHIER // 
 * {@link WriteSymptomDataToFile} implement ISymptomWriter
 * </ul> 
 * 
 * @see ISymptomReader
 * Interface ISymptomReader
 * @see ISymptomCounter
 * Interface ISymptomCounter
 * @see ISymptomWriter
 * Interface ISymptomWriter
 * 
 * @author xGuix
 * @version v1.0
 */

public class AnalyticsCounter
{
	/**
	 * <p>
	 * Déclaration du fichier d'entrée inputFile ("symptoms.txt") et de sortie outputFile ("result.out")
	 * </p><p>
	 * <b>Instance de l'objet {@link ObjAnalyser} nommée (MyAnalyser)</b>
	 * 
	 * </p>
	 * Appel des 3 methodes de mon objet:
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
		new CountSymptomDataFromFile(), new WriteSymptomDataToFile(outputFile));
			// Appelle de methode pour obtenir la liste des symptoms du fichier "symptoms.txt"
			MyAnalyser.getSymptomsList();
		    // Appelle de methodes pour compter les symptoms
		    MyAnalyser.getCountedList();
		    // Appelle de methode pour ecrire le resultat dans le fichier "result.out"
		    MyAnalyser.getWritedList();
	}
}
