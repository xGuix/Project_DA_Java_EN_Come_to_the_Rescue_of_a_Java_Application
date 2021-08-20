package com.hemebiotech.analytics;

public class AnalyticsCounter
{
	public static void main(String args[]) throws Exception
	{
		final String inputFile = "symptoms.txt";
		final String outputFile = "result.out";

		ObjAnalyser MonAnalyser = new ObjAnalyser(new ReadSymptomDataFromFile("symptoms.txt"),
		new CountSymptomDataFromFile(outputFile), new WriteSymptomDataToFile("result.out"));
		
		inputFile = MonAnalyser.symptomsReader(filepath);
		
			// MonAnalyser.symptomsReader(inputFile);
		    // MonAnalyser.symptomsCounter();
			// MonAnalyser.symptomsWriter(outputFile); 
			
		    System.out.println(MonAnalyser.symptomsReader(null));
			System.out.println(MonAnalyser.symptomsCounter());
			System.out.println(MonAnalyser.symptomsWriter());
	}
}