package com.hemebiotech.analytics;

public class AnalyticsCounter
{
	public static void main(String args[]) throws Exception
	{
<<<<<<< HEAD:Project02Eclipse/src/com.hemebiotech.analytics/AnalyticsCounter.java
		// Je d�clare mes fichier d'entr�es et de sorties
=======
		// Je declare mes fichier d'entr�es et de sorties
>>>>>>> origin/Objet_&_interfaces:Project02Eclipse/src/com/hemebiotech/analytics/AnalyticsCounter.java
		final String inputFile = "symptoms.txt";
		final String outputFile = "result.out";
		// J'instancie ma class Objet d'analyse "ObjAnalyser"
		ObjAnalyser MonAnalyser = new ObjAnalyser(new ReadSymptomDataFromFile(inputFile),
<<<<<<< HEAD:Project02Eclipse/src/com.hemebiotech.analytics/AnalyticsCounter.java
		new CountSymptomDataFromFile(outputFile), new WriteSymptomDataToFile(outputFile));
			// J'appelle ma m�thode pour obtenir la liste des symptoms du fichier "symptoms.txt"
			MonAnalyser.getSymptomsList();
		    // J'appelle ma m�thodes pour compter les iterations de Sting
		    MonAnalyser.getCountedList();
		    System.out.println(MonAnalyser.listSymptomsCounted);
		    // J'appelle ma m�thode pour �crire le r�sultat dans le fichier "result.out" 
=======
		new CountSymptomDataFromFile(), new WriteSymptomDataToFile(outputFile));
			// J'appelle ma methode pour obtenir la liste des symptoms du fichier "symptoms.txt"
			MonAnalyser.getSymptomsList();
		    // J'appelle ma methodes pour compter les iterations de Sting
		    MonAnalyser.getCountedList();
		    // J'appelle ma methode pour ecrire le resultat dans le fichier "result.out" 
>>>>>>> origin/Objet_&_interfaces:Project02Eclipse/src/com/hemebiotech/analytics/AnalyticsCounter.java
		    MonAnalyser.getWritedList();
		    
		    System.out.println(MonAnalyser.listSymptomsCounted);
	}
}
