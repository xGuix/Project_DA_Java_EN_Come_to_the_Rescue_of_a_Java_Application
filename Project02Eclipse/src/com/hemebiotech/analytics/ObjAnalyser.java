package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class ObjAnalyser
{
	// J'ai besoin d'une façon de lire
	private ISymptomReader symptomsReader;
	// J'ai besoin d'une façon d'écrire le résultat
	private ISymptomWriter symptomsWriter;
	// J'ai besoin d'une façon de compter et trier
	private ISymptomCounter symptomsCounter;
	// J'ai besoin de 2 listes pour stocker mes données
	List<String> listSymptoms;
	TreeMap<String,Integer> listSymptomsCounted;
	
	// Mon constructeur me permet de construire un objet ObjAnalyser
	// Avec les caractéristiques de mes 3 interfaces Reader, Counter, Writer
	public ObjAnalyser(ISymptomReader symptomsReader, ISymptomCounter symptomsCounter, ISymptomWriter symptomsWriter)
	{
		this.symptomsReader = symptomsReader;
		this.symptomsCounter = symptomsCounter;
		this.symptomsWriter = symptomsWriter;
	}
	// Je déclare ma méthodes pour Lire via l'interface ISymptomsReader
	// Renvoi le résultat SymptomsReader
	public ISymptomReader symptomsReader()
	{
		this.symptomsReader = symptomsReader();
		return symptomsReader;
	}
	// Je déclare ma méthodes pour Compter via l'interface ISymptomsCounter
	// Renvoi le résultat symptomsCounter
	public ISymptomCounter symptomsCounter()
	{
		this.symptomsCounter = symptomsCounter();
		return symptomsCounter;
	}
	// Je déclare ma méthodes pour Ecrire via l'interface ISymptomsWriter
	// Renvoi le résultat symptomsWriter
	public ISymptomWriter symptomsWriter()
	{
		this.symptomsWriter = symptomsWriter();
		return symptomsWriter;
	}
	// Je déclare ma méthode récuperer la liste symptom via l'interface
	public void getSymptomsList()
	{
		this.listSymptoms = symptomsReader.GetSymptoms();
	}
	// Je déclare ma méthode compter et trier ma liste symptom via TreeMAp
	public void getCountedList()
	{
		this.listSymptomsCounted = symptomsCounter.getSymptomsCounted(listSymptoms);
	}
	// Je déclare ma méthode ecrire la liste compté via TreeMap
	public void getWritedList() throws Exception
	{
		symptomsWriter.getSymptomsWrited(listSymptomsCounted);
	}
}