package com.hemebiotech.analytics;

<<<<<<< HEAD
	abstract public class ObjAnalyser implements ISymptomReader {
		
		String symptoms;
		Integer totalOfSymptoms;
		
		abstract void ISymptomReader();
			
}
=======
import java.util.List;
import java.util.TreeMap;

public class ObjAnalyser
{

	//J'ai besoin d'une fa�on de lire
	private ISymptomReader symptomsReader;
	//J'ai besoin d'une fa�on d'�crire le r�sultat
	private ISymptomWriter symptomsWriter;
	//J'ai besoin d'une fa�on de compter et trier
	private ISymptomCounter symptomsCounter;

	List<String> listSymptoms;
	TreeMap<String,Integer> listSymptomsCounted;
	
	//Mon constructeur me permet de construire un objet 
	//ObjAnalyser avec les caract�ristiques que je lui donne
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
	
	public ISymptomCounter symptomsCounter()
	{
		this.symptomsCounter = symptomsCounter();
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
	
	public void getSymptomsCounted()
	{
		this.listSymptomsCounted = symptomsCounter.getSymptomsCounted(listSymptoms);
	}
		
	public void getSymptomsWrited() throws Exception
	{
		symptomsWriter.getSymptomsWrited(listSymptomsCounted);
	}
}
>>>>>>> Objet_&_interfaces
