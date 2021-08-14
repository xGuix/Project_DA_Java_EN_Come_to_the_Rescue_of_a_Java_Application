package com.hemebiotech.analytics;

import java.util.ArrayList;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		//first get input	
		//BufferedReader read = new BufferedReader (new FileReader("/Users/guillaumebrenot/Git/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt"));
		//String count = read.readLine();
		//System.out.println("Symptoms : " + count);
		//count = read.readLine();
				
		ObjAnalyser MonAnalyser = new ObjAnalyser();
		MonAnalyser.listOfSymptoms(MonAnalyser);
		
		System.out.println("TEST symptomName : " + MonAnalyser.symptomName);
		System.out.println("TEST GetSymptoms : " + MonAnalyser.GetSymptoms());
		
		System.out.println("TEST MonAnalyser : " + MonAnalyser);
	}
}
			
			
/*
BufferedReader reader = new BufferedReader (new FileReader("/Users/guillaumebrenot/Git/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt"));
String line = reader.readLine();

	for (int i = 0;line!=null;i++) {
		line = reader.readLine();
		System.out.println("ligne : " + i);
		System.out.println("Symptoms : " + line);
		System.out.println();
		
		if (line==null) {
			reader.close();
       	}
	} */