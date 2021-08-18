package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class ObjAnalyser extends AnalyticsCounter {

	//J'ai besoin d'une fa�on de lire
	private ISymptomReader symptomsReader;
	//J'ai besoin d'une fa�on d'�crire le r�sultat
	private ISymptomWriter symptomsWriter;
	//J'ai besoin d'une fa�on de compter et trier
	private ISymptomCounter symptomsCounter;

	private List<String> listSymptoms;
	private TreeMap<String, Integer> listsymptomsWriter;
	
	//Mon constructeur me permet de construire un objet 
	//ObjAnalyser avec les caract�ristiques que je lui donne
	public ObjAnalyser(ISymptomReader symptomsReader, ISymptomCounter symptomsCounter, ISymptomWriter symptomsWriter) {
		this.symptomsReader = symptomsReader;
		this.symptomsCounter = symptomsCounter;
		this.symptomsWriter = symptomsWriter;
	}
	
	public ISymptomReader symptomsReader() {
		this.symptomsReader = (ISymptomReader) symptomsReader.GetSymptoms();
		return symptomsReader;
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