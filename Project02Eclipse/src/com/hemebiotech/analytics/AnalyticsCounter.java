package com.hemebiotech.analytics;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		ObjAnalyser MonAnalyser = new ObjAnalyser();
		MonAnalyser.listOfSymptoms();

		System.out.println("TEST symptomName : " + MonAnalyser.symptomName);
		System.out.println("TEST ReadSymptoms : " + MonAnalyser.ReadSymptoms);
		System.out.println("TEST ListOfSymptoms : " + MonAnalyser.listOfSymptoms());
		System.out.println("TEST MonAnalyser : " + MonAnalyser);
	}
}