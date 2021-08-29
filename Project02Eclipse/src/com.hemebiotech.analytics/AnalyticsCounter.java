package com.hemebiotech.analytics;

public class AnalyticsCounter
{
	public static void main(String args[]) throws Exception
	{
		// Je d�clare mes fichier d'entr�es et de sorties
		final String inputFile = "symptoms.txt";
		final String outputFile = "result.out";
		// J'instancie ma class Objet d'analyse "ObjAnalyser"
		ObjAnalyser MonAnalyser = new ObjAnalyser(new ReadSymptomDataFromFile(inputFile),
		new CountSymptomDataFromFile(outputFile), new WriteSymptomDataToFile(outputFile));
			// J'appelle ma m�thode pour obtenir la liste des symptoms du fichier "symptoms.txt"
			MonAnalyser.getSymptomsList();
		    // J'appelle ma m�thodes pour compter les iterations de Sting
		    MonAnalyser.getCountedList();
		    System.out.println(MonAnalyser.listSymptomsCounted);
		    // J'appelle ma m�thode pour �crire le r�sultat dans le fichier "result.out" 
		    MonAnalyser.getWritedList();
	}
}
