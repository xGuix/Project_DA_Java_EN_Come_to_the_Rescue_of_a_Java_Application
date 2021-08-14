package com.hemebiotech.analytics;


public class ObjAnalyser extends ReadSymptomDataFromFile {
		
	private static String filepath;
	String symptomName;
	Integer totalOfSymptoms;
	Integer NumberOfEach;

	
		public ObjAnalyser() {
		super(filepath);
		ObjAnalyser StringAnalyser = new ObjAnalyser();
		ReadSymptomDataFromFile ReadSymptoms = new ReadSymptomDataFromFile(filepath);
		StringAnalyser.GetSymptoms();
		ReadSymptoms.GetSymptoms();
	}
		
		public String listOfSymptoms(ReadSymptomDataFromFile readSymptomDataFromFile) {
			this.symptomName= filepath;
			 return listOfSymptoms(ReadSymtoms(symptomName));
		}

		public ReadSymptomDataFromFile ReadSymtoms(String symptomName) {
			this.symptomName= symptomName;
			return ReadSymtoms(symptomName);
		}

}