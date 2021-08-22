package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class ObjAnalyser extends AnalyticsCounter
{

	//J'ai besoin d'une façon de lire
	private ISymptomReader symptomsReader;
	//J'ai besoin d'une façon d'écrire le résultat
	private ISymptomWriter symptomsWriter;
	//J'ai besoin d'une façon de compter et trier
	private ISymptomCounter symptomsCounter;

	List<String> listSymptoms;
	TreeMap<String, Integer> listSymptomsWriter;
	
	//Mon constructeur me permet de construire un objet 
	//ObjAnalyser avec les caractéristiques que je lui donne
	public ObjAnalyser(ISymptomReader symptomsReader, ISymptomCounter symptomsCounter, ISymptomWriter symptomsWriter)
	{
		this.symptomsReader = symptomsReader;
		this.symptomsCounter = symptomsCounter;
		this.symptomsWriter = symptomsWriter;
	}
	
	public ISymptomReader symptomsReader()
	{
		this.symptomsReader = symptomsReader();
		return symptomsReader;
	}
	
	public ISymptomCounter symptomsCounter(List<String> listSymptoms)
	{
		this.symptomsCounter = symptomsCounter(listSymptoms);
		return symptomsCounter;
	}
	
	public ISymptomWriter symptomsWriter()
	{
		this.symptomsWriter = symptomsWriter();
		return symptomsWriter;
	}

	public void getSymptomsList()
	{
		this.listSymptoms = symptomsReader.GetSymptoms();
	}
	
	public void listSymptomsWriter()
	{
		this.listSymptomsWriter = (TreeMap<String, Integer>) symptomsWriter();
	}
}