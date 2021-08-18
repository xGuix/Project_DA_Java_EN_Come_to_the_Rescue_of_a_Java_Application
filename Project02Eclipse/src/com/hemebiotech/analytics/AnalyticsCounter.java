package com.hemebiotech.analytics;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		final String inputFile = "symptoms.txt";
		final String outputFile = "result.out";

		ObjAnalyser MonAnalyser = new ObjAnalyser(new ReadSymptomDataFromFile(inputFile),
			new CountSymptomDataFromFile(inputFile), new WriteSymptomDataToFile(outputFile));
			MonAnalyser.symptomsReader();
		    MonAnalyser.symptomsCounter();
			MonAnalyser.symptomsWriter(); 
			
		    
		    System.out.println(MonAnalyser.symptomsReader());
			System.out.println(MonAnalyser.symptomsCounter());
			System.out.println(MonAnalyser.symptomsWriter());
	}
}