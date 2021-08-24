package com.hemebiotech.analytics;
public class AnalyticsCounter
{
	public static void main(String args[]) throws Exception
	{
		// Je déclare mes fichier d'entrées et de sorties
		final String inputFile = "symptoms.txt";
		final String outputFile = "result.out";
		// J'instancie ma class Objet d'analyse "ObjAnalyser"
		ObjAnalyser MonAnalyser = new ObjAnalyser(new ReadSymptomDataFromFile(inputFile),
		new CountSymptomDataFromFile(outputFile), new WriteSymptomDataToFile(outputFile));
			// J'appelle ma méthode pour obtenir la liste des symptoms du fichier "symptoms.txt"
			MonAnalyser.getSymptomsList();
		    System.out.println(MonAnalyser.listSymptoms);
		    // J'appelle ma méthodes pour compter les iterations de Sting
		    MonAnalyser.getCountedList();
		    System.out.println(MonAnalyser.listSymptomsCounted);
		    // J'appelle ma méthode pour écrire le résultat dans le fichier "result.out" 
		    // MonAnalyser.getSymptomsWrited();		   
	}
}