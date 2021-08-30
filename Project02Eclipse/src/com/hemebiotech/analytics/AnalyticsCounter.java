package com.hemebiotech.analytics;

public class AnalyticsCounter
{
	public static void main(String args[]) throws Exception
	{
		// Je declare mes fichier d'entr�es et de sorties
		final String inputFile = "symptoms.txt";
		final String outputFile = "result.out";
		// J'instancie ma class Objet d'analyse "ObjAnalyser"
		ObjAnalyser MonAnalyser = new ObjAnalyser(new ReadSymptomDataFromFile(inputFile),
		new CountSymptomDataFromFile(), new WriteSymptomDataToFile(outputFile));
			// J'appelle ma methode pour obtenir la liste des symptoms du fichier "symptoms.txt"
			MonAnalyser.getSymptomsList();
		    // J'appelle ma methodes pour compter les iterations de Sting
		    MonAnalyser.getCountedList();
		    // J'appelle ma methode pour ecrire le resultat dans le fichier "result.out" 
		    MonAnalyser.getWritedList();
		    
		    System.out.println(MonAnalyser.listSymptomsCounted);
	}
}