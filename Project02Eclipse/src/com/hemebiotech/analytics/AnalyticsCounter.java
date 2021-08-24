package com.hemebiotech.analytics;

<<<<<<< HEAD
<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.FileReader;


public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		BufferedReader reader = new BufferedReader (new FileReader("/Users/guillaumebrenot/Git/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt"));
		String line = reader.readLine();

		int i = 0;	// set i to 0
		int headCount = i;
		int rashCount = i;
		
		
		while (line !=null) {
			i++;	// increment i
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rash")) {
				rashCount++;
				System.out.println("number of rashs: " + rashCount);
			}
		
			line = reader.readLine();	// get another symptom
		}
}}
=======
=======
>>>>>>> Fonction_Main
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
<<<<<<< HEAD
}
>>>>>>> objet_&_interfaces
=======
}
>>>>>>> Fonction_Main
