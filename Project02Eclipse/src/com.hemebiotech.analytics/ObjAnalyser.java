package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class ObjAnalyser
{
	// J'ai besoin d'une fa�on de lire
<<<<<<< HEAD:Project02Eclipse/src/com.hemebiotech.analytics/ObjAnalyser.java
s	private ISymptomReader symptomsReader;
=======
	private ISymptomReader symptomsReader;
>>>>>>> origin/Objet_&_interfaces:Project02Eclipse/src/com/hemebiotech/analytics/ObjAnalyser.java
	// J'ai besoin d'une fa�on d'�crire le r�sultat
	private ISymptomWriter symptomsWriter;
	// J'ai besoin d'une fa�on de compter et trier
	private ISymptomCounter symptomsCounter;
	// J'ai besoin de 2 listes pour stocker mes donn�es
	List<String> listSymptoms;
	TreeMap<String,Integer> listSymptomsCounted;
	
	// Mon constructeur me permet de construire un objet ObjAnalyser
	// Avec les caract�ristiques de mes 3 interfaces Reader, Counter, Writer
	public ObjAnalyser(ISymptomReader symptomsReader, ISymptomCounter symptomsCounter, ISymptomWriter symptomsWriter)
	{
		this.symptomsReader = symptomsReader;
		this.symptomsCounter = symptomsCounter;
		this.symptomsWriter = symptomsWriter;
	}
	// Je d�clare ma m�thodes pour Lire via l'interface ISymptomsReader
	// Renvoi le r�sultat SymptomsReader
	public ISymptomReader symptomsReader()
	{
		this.symptomsReader = symptomsReader();
		return symptomsReader;
	}
	// Je d�clare ma m�thodes pour Compter via l'interface ISymptomsCounter
	// Renvoi le r�sultat symptomsCounter
	public ISymptomCounter symptomsCounter()
	{
		this.symptomsCounter = symptomsCounter();
		return symptomsCounter;
	}
	// Je d�clare ma m�thodes pour Ecrire via l'interface ISymptomsWriter
	// Renvoi le r�sultat symptomsWriter
	public ISymptomWriter symptomsWriter()
	{
		this.symptomsWriter = symptomsWriter();
		return symptomsWriter;
	}
	// Je d�clare ma m�thode r�cuperer la liste symptom via l'interface
	public void getSymptomsList()
	{
		this.listSymptoms = symptomsReader.GetSymptoms();
	}
	// Je d�clare ma m�thode compter et trier ma liste symptom via TreeMAp
	public void getCountedList() throws Exception
	{
		this.listSymptomsCounted = symptomsCounter.getSymptomsCounted(listSymptoms);
	}
	// Je d�clare ma m�thode ecrire la liste compt� via TreeMap
	public void getWritedList() throws Exception
	{
		this.symptomsWriter.getSymptomsWrited(listSymptomsCounted);
	}
}