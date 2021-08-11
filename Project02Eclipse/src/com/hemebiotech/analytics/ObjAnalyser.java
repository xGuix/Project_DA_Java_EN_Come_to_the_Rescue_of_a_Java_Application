package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;

public class ObjAnalyser extends AnalyticsCounter {
		
		public String symptomName;
		public Integer totalOfSymptoms;

		public String ISymptomsReader;
		public String GetSymptoms;
		public String ISymptomsCounter;
		public String CountSymptoms;
		public String ISymptomsWriter;
		public String WriteSymptoms;
		
		public Integer NumberOfEach;
		
		
		public void ISymptomsReader() {
		BufferedReader analyser = new BufferedReader (new FileReader("/Users/guillaumebrenot/Git/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt"));
		String line = analyser.readLine();
		}
		
		public void ISymptomsCounter() {

		}
		
		public void ISymptomsWriter() {
			
			
		}
			
}