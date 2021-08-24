package com.hemebiotech.analytics;

import java.io.IOException;

public class AnalyticsCounter
{
	public static void main(String args[]) throws IOException
	{
		// Je déclare mes fichier d'entrées et de sorties
		final String inputFile = "symptoms.txt";
		final String outputFile = "result.out";
		
		// J'instancie ma class Objet d'analyse "ObjAnalyser"
		ObjAnalyser MonAnalyser = new ObjAnalyser(new ReadSymptomDataFromFile(inputFile),
		new CountSymptomDataFromFile(outputFile), new WriteSymptomDataToFile(outputFile));
			// J'appelle ma methode pour obtenir la liste des symptoms du fichier "symptoms.txt"
			MonAnalyser.getSymptomsList();
		    System.out.println(MonAnalyser.listSymptoms);
		    
		    MonAnalyser.getSymptomsCounted();
		    System.out.println(MonAnalyser.listSymptomsCounted);
		    
		    // MonAnalyser.getSymptomsWrited();		   
	}
}
