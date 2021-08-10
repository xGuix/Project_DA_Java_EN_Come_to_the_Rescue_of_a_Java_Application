package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		//first get input
		BufferedReader reader = new BufferedReader (new FileReader("/Users/guillaumebrenot/Git/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt"));
		String line = reader.readLine();
		HashMap<String, Integer> symptoms = new HashMap<String, Integer>();
		
		for (int i = 0;line!=null;i++) {
			line = reader.readLine();
			symptoms.put(line, i);
			System.out.println("ligne : " + i);
			System.out.println("Symptoms : " + line);
		}
		
		//String nameFile = "/Users/guillaumebrenot/Git/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt";
		//String contentFile = ReadSymptomDataFromFile(nameFile);
		//ObjAnalyser Analyse = new ObjAnalyser (new ReadSymptomDataFromFile(nameFile));
	
		
		
		/* int i = 0;	// set i to 0
		int headCount = i;	// counts headaches
		while (line != null) {
			i++;	// increment i
			System.out.println("symptom from file: " + line);
			
			if (line.contains("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.contains("rush")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.readLine();	// get another symptom
		}
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close(); */
	}

}