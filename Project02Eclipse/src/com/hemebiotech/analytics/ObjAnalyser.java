package com.hemebiotech.analytics;

public class ObjAnalyser {

	private static String filepath;
	String symptomName;
	Integer totalOfSymptoms;
	Integer NumberOfEach;

	ReadSymptomDataFromFile ReadSymptoms = new ReadSymptomDataFromFile("C:\\Users\\U1\\git\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");

	public String listOfSymptoms() {
		this.symptomName = filepath;
		return symptomName;
	}

	public ReadSymptomDataFromFile ReadSymptoms() {
		ReadSymptoms.GetSymptoms();
		return ReadSymptoms;
	}

}