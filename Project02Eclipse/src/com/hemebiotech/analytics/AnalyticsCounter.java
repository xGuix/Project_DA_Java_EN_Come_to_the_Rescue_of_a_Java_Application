package com.hemebiotech.analytics;

import java.io.IOException;

public class AnalyticsCounter
{
	public static void main(String args[]) throws IOException
	{
		final String inputFile = "symptoms.txt";
		final String outputFile = "result.out";
		
		ObjAnalyser MonAnalyser = new ObjAnalyser(new ReadSymptomDataFromFile(inputFile),
		new CountSymptomDataFromFile(outputFile), new WriteSymptomDataToFile(outputFile));

			MonAnalyser.getSymptomsList();
		    System.out.println(MonAnalyser.listSymptoms);
		    
		    MonAnalyser.getSymptomsCounted();
		    System.out.println(MonAnalyser.listSymptomsCounted);
		    
		    // MonAnalyser.getSymptomsWrited();
	}
}
