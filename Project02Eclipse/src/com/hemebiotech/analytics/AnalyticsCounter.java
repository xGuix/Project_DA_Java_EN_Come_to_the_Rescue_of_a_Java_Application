package com.hemebiotech.analytics;

public class AnalyticsCounter
{
	public static void main(String args[]) throws Exception
	{
		final String inputFile = "symptoms.txt";
		final String outputFile = "result.out";

		ObjAnalyser MonAnalyser = new ObjAnalyser(new ReadSymptomDataFromFile("symptoms.txt"),
		new CountSymptomDataFromFile(inputFile), new WriteSymptomDataToFile("result.out"));

			MonAnalyser.getSymptomsList();
		    //MonAnalyser.symptomsCounter();
			MonAnalyser.listSymptomsWriter();
			
		    System.out.println(MonAnalyser.listSymptoms);
		    System.out.println(MonAnalyser.listSymptomsWriter);
	}
}