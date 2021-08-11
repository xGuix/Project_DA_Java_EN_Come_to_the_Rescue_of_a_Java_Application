package com.hemebiotech.analytics;


public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		//first get input	
		//BufferedReader read = new BufferedReader (new FileReader("/Users/guillaumebrenot/Git/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt"));
		//String count = read.readLine();
		//System.out.println("Symptoms : " + count);
		//count = read.readLine();
		
		ObjAnalyser ObjAnalyser = new ObjAnalyser (new ReadSymptomDataFromFile("/Users/guillaumebrenot/Git/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt"));
		ObjAnalyser.GetSymptoms();
		String analyser = ObjAnalyser.GetSymptoms();
		analyser = ObjAnalyser.ISymptomReader();
		System.out.println("Symptoms : " + analyser);
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