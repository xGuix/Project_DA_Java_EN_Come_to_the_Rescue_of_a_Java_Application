package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;

public class AnalyticsCounter {
	

	public static void main(String args[]) throws Exception {

		/*
		ObjAnalyser MonAnalyser = new ObjAnalyser();
		MonAnalyser.listOfSymptoms();

		System.out.println("TEST symptomName : " + MonAnalyser.symptomName);
		System.out.println("TEST ListOfSymptoms : " + MonAnalyser.listOfSymptoms());
		System.out.println("TEST ReadSymptoms : " + MonAnalyser.ReadSymptoms());
		*/
		
		ObjAnalyser MonAnalyser = new ObjAnalyser(new ReadSymptomDataFromFile("C:\\Users\\U1\\git\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt"));
		    MonAnalyser.getSymptomsList();
		    MonAnalyser.symptomsCounter();
		    
		    System.out.println(MonAnalyser.getSymptomsList());
			System.out.println(MonAnalyser.symptomsCounter());

	}
}