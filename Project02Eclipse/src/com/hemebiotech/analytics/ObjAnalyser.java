package com.hemebiotech.analytics;

public class ObjAnalyser extends AnalyticsCounter {

	//J'ai besoin d'une façon de lire
	private ISymptomReader symptomsRead;
	//J'ai besoin d'une façon d'écrire le résultat
	private ISymptomWriter symptomsWriter;
	//J'ai besoin d'une façon de compter et trier
	private ISymptomCounter symptomsCounter;

		
	//Mon constructeur me permet de construire un objet 
	//ObjAnalyser avec les caractéristiques que je lui donne
	public ObjAnalyser(ISymptomReader symptomsRead, ISymptomCounter symptomsCounter, ISymptomWriter symptomsWriter) {
		this.symptomsRead = symptomsRead;
		this.symptomsCounter = symptomsCounter;
		this.symptomsWriter = symptomsWriter;
	}

/*	public ObjAnalyser(ReadSymptomDataFromFile readSymptomDataFromFile, WriteSymptomDataToFile writeSymptomDataToFile) {
		this.symptomsReader();
		this.symptomsCounter();
		this.symptomsWriter();
	}
*/
	
	public ISymptomReader symptomsReader() {
		this.symptomsRead = symptomsReader();
		return symptomsRead;
	}
	
	public ISymptomCounter symptomsCounter() {
		this.symptomsCounter = symptomsCounter();
		return symptomsCounter;
	    }
	
	public ISymptomWriter symptomsWriter() {
		this.symptomsWriter = symptomsWriter();
		return symptomsWriter;
	}
}