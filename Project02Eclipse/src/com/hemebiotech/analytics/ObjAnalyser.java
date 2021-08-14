package com.hemebiotech.analytics;


public class ObjAnalyser {
		
	private static String filepath;
	String symptomName;
	Integer totalOfSymptoms;
	Integer NumberOfEach;

	
		ReadSymptomDataFromFile ReadSymptoms = new ReadSymptomDataFromFile("symptoms.txts");
		
		
		public String listOfSymptoms() {
			this.symptomName= filepath;
			 return symptomName;
		}

		public ReadSymptomDataFromFile ReadSymptoms() {
			ReadSymptoms.GetSymptoms();
			return ReadSymptoms;
		}

}