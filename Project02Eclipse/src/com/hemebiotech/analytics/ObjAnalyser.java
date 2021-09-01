package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * <p>
 * <b>La class {ObjAnalyser} possede toutes les methodes & les interfaces pour :</b></br>
 * 		- Lire un fichier et le renvoyer vers une liste</br>
 * 		- Trier par ordre alphabetique et compter les occurences puis renvoyer la liste</br>
 * 		- Ecrire le resultat formate dans un nouveau fichier</br>
 * </p><p>
 * <b>Contient des attributs privés pour appeler les 3 interfaces :</b>
 * <ul>
 * <li> ISymptomReader {@link ISymptomReader}
 * <li> ISymptomCounter {@link ISymptomCounter}
 * <li> ISymptomWriter {@link ISymptomWriter}
 * </ul>
 * </p><p>
 * <b>Contient les attributs des 2 listes de recuperation :</b>
 * <ul>
 * <li> listSymptoms {@link listSymptoms} Liste des symptoms du fichier (inputFile) 
 * <li> listSymptomsCounted {@link listSymptomsCounted} Liste des symptoms trier et compter
 * </ul>
 * </p><p>
 * <b>Un constructeur {Objanalyser} pour créer l'objet d'analyse</b></br>
 * Implementation par appel de leurs interfaces respectives.
 * </p>
 * 
 * @author xGuix
 * @version v1.0
 */

public class ObjAnalyser
{
	// Instance de type ISymptomReader pour lire via constructeur {ObjAnalyser}
	private ISymptomReader symptomsReader;
	// Instance de type ISymptomCounter pour trier et compter via constructeur {ObjAnalyser}
	private ISymptomCounter symptomsCounter;
	// Instance de type IsymptomWriter pour ecrire via constructeur {ObjAnalyser}
	private ISymptomWriter symptomsWriter;
	
	// Déclaration d'une liste pour récuperer les donnees du fichier inputFile
	List<String> listSymptoms;
	// Déclaration d'une TreeMap pour trier et compter les donnees de la listSymptoms
	TreeMap<String,Integer> listSymptomsCounted;
	
	/**
	 * <b>Constructeur permettant de construire l'objet ObjAnalyser</b>
	 * <p>Avec les attributs de chacunes des 3 interfaces 
	 * <ul>
	 * <li>(symptomsReader) utilise {@link ReadSymptomDataFromFile} via l'interface ISymptomReader
	 * <li>(symptomsCounter) utilise {@link CountSymptomDataFromFile} via l'interfaceISymptomCounter
	 * <li>(symptomsWriter) utilise {@link WriteSymptomDataToFile} via l'interfaceISymptomWriter
	 * </ul>
	 * </p>
	 * @param symptomsReader {@link ISymptomReader}
	 * @param symptomsCounter {@link ISymptomCounter}
	 * @param symptomsWriter {@link ISymptomWriter}
	 */
	public ObjAnalyser(ISymptomReader symptomsReader, ISymptomCounter symptomsCounter, ISymptomWriter symptomsWriter)
	{
		this.symptomsReader = symptomsReader;
		this.symptomsCounter = symptomsCounter;
		this.symptomsWriter = symptomsWriter;
	}
	// Je declare ma methodes pour Lire via l'interface ISymptomsReader
	// Renvoi le resultat SymptomsReader
	public ISymptomReader symptomsReader()
	{
		this.symptomsReader = symptomsReader();
		return symptomsReader;
	}
	// Je declare ma methodes pour Compter via l'interface ISymptomsCounter
	// Renvoi le resultat symptomsCounter
	public ISymptomCounter symptomsCounter()
	{
		this.symptomsCounter = symptomsCounter();
		return symptomsCounter;
	}
	// Je declare ma methodes pour Ecrire via l'interface ISymptomsWriter
	// Renvoi le resultat symptomsWriter
	public ISymptomWriter symptomsWriter()
	{
		this.symptomsWriter = symptomsWriter();
		return symptomsWriter;
	}
	// Je declare ma methode recuperer la liste symptom via l'interface
	public void getSymptomsList()
	{
		this.listSymptoms = symptomsReader.getSymptoms();
	}
	// Je declare ma methode compter et trier ma liste symptom via TreeMAp
	public void getCountedList() throws Exception
	{
		this.listSymptomsCounted = symptomsCounter.getSymptomsCounted(listSymptoms);
	}
	// Je declare ma methode ecrire la liste compt� via TreeMap
	public void getWritedList() throws Exception
	{
		this.symptomsWriter.getSymptomsWrited(listSymptomsCounted);
	}
}