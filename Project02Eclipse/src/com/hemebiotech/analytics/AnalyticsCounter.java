package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;


public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		//first get input
		ObjAnalyser analyse = new ObjAnalyser(new ReadSymptomDataFromFile(reader));
		GetSymptoms 
		
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