package com.hemebiotech.analytics;

<<<<<<< HEAD

public class AnalyticsCounter implements ObjAnalyser {
	
	public static void main(String args[]) throws Exception {
			
		ObjAnalyser Analyse = new ObjAnalyser (new ReadSymptomDataFromFile(GetSymptoms));
		Analyse.GetSymptoms( );
		
		
=======
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
 * Interface ISymptomReader de {@link ReadSymptomDataFromFile}
 * @see ISymptomCounter
 * Interface ISymptomCounter de {@link CountSymptomDataFromFile}
 * @see ISymptomWriter
 * Interface ISymptomWriter de {@link WriteSymptomDataToFile}
 * 
 * @author xGuix
 * @version v1.0
 */

public class AnalyticsCounter
{
	/**
	 * <p>
	 * Je declare les liens vers les fichiers d'entrées (inputFile) et de sorties (outputFile)
	 * </p><p>
	 * <b>Instance de l'objet {@link ObjAnalyser} nommée (MonAnalyser)</b>
	 * </p>
	 * Utilisation des 3 methodes de mon objet:
	 * <ul>
	 * <li>	 .getSymptomsList() {@link ObjAnalyser.getSymptomsList()}
	 * <li>	 .getCountedList() {@link ObjAnalyser.getCountedList}
	 * <li>	 .getWritedList() {@link ObjAnalyser.getWritedList}
	 * </ul>
	 * 
	 * @param inputFile Fichier d'entrée (inputFile)
	 * @param outputFile Fichier de sortie (outputFile)
	 * @param args no Value
	 * @throws Exception Try / catch
	 */
	
	public static void main(String args[]) throws Exception
	{
		// Déclare le nom des fichiers in et out
		final String inputFile = "symptoms.txt";
		final String outputFile = "result.out";
		// Instance de class Objet {ObjAnalyser} avec les valeurs mes methodes
		ObjAnalyser MonAnalyser = new ObjAnalyser(new ReadSymptomDataFromFile(inputFile),
		new CountSymptomDataFromFile(), new WriteSymptomDataToFile(outputFile));
			// Appelle de methode pour obtenir la liste des symptoms du fichier "symptoms.txt"
			MonAnalyser.getSymptomsList();
		    // Appelle de methodes pour compter les symptoms
		    MonAnalyser.getCountedList();
		    // Appelle de methode pour ecrire le resultat dans le fichier "result.out"
		    MonAnalyser.getWritedList();
>>>>>>> release
	}
}