package com.hemebiotech.analytics;

public class AnalyticsCounter {
	
	private static String filepath;

	public static void main(String args[]) throws Exception {
		
		final String inputFile = "symptoms.txt";
		final String outputFile = "result.out";

		ObjAnalyser MonAnalyser = new ObjAnalyser(new ReadSymptomDataFromFile(inputFile),
			new CountSymptomDataFromFile(filepath), new WriteSymptomDataToFile(outputFile));
			MonAnalyser.symptomsReader(inputFile);
		    MonAnalyser.symptomsCounter(filepath);
			MonAnalyser.symptomsWriter(outputFile); 
			
		    System.out.println(MonAnalyser.symptomsReader(inputFile));
			System.out.println(MonAnalyser.symptomsCounter(filepath));
			System.out.println(MonAnalyser.symptomsWriter(outputFile));
	}
}