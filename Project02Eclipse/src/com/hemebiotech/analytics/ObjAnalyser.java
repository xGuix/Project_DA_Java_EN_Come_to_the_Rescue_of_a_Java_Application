package com.hemebiotech.analytics;
import java.util.List;
import java.util.LinkedHashMap;

public class ObjAnalyser {
	/*
	String symptomName;
	ArrayList<String> totalOfSymptoms;
	int NumberOfEach;

	public String listOfSymptoms() {
		this.symptomName = "TestRetourValue";
		return symptomName;
	}

	public ArrayList<String> ReadSymptoms() {
		new ReadSymptomDataFromFile(symptomName);
		return totalOfSymptoms;
	}
	*/
	private ISymptomReader symptomsRead;
	private List<String> symptomsList;
	private LinkedHashMap<String, Integer> symptomsCounter;
		
	public ObjAnalyser(ISymptomReader symptomsRead) {
		this.symptomsRead = symptomsRead;
	}
	
	public List<String> getSymptomsList() {
		this.symptomsList = symptomsRead.GetSymptoms();
		return symptomsList;
	}
	
	public LinkedHashMap<String, Integer> symptomsCounter() {
		this.symptomsCounter = new LinkedHashMap<String, Integer>();
		return symptomsCounter;
	    }
}