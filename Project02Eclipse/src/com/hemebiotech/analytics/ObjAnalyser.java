package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * <p>
 * <b>La class {ObjAnalyser} possede toutes les methodes et les interfaces pour :</b><br>
 * 		- Lire un fichier et le renvoyer vers une liste<br>
 * 		- Trier par ordre alphabetique et compter les occurences puis renvoyer la liste<br>
 * 		- Ecrire le resultat formate dans un nouveau fichier<br>
 * <p>
 * <b>Contient des attributs privés pour appeler les 3 interfaces :</b>
 * <ul>
 * <li> ISymptomReader {@link ISymptomReader}
 * <li> ISymptomCounter {@link ISymptomCounter}
 * <li> ISymptomWriter {@link ISymptomWriter}
 * </ul>
 * <p>
 * <b>Contient les attributs des 2 listes de recuperation :</b>
 * <ul>
 * <li> listSymptoms {@link listSymptoms} Liste des symptoms du fichier (inputFile)
 * <li> listSymptomsCounted {@link listSymptomsCounted} Liste des symptoms trier et compter
 * </ul>
 * <p>
 * <b>Contient un constructeur {Objanalyser} pour créer l'objet d'analyse</b><br>
 * Déclare leurs methodes respective : symptomsReader(), symptomsCounter(), symptomsWriter().
 * <ul>
 * <li> symptomsReader {@link ReadSymptomDataFromFile} implemente l'interface {@link ISymptomReader}
 * <li> symptomsCounter {@link CountSymptomDataFromFile} implemente l'interface {@link ISymptomCounter}
 * <li> symptomsWriter {@link WriteSymptomDataToFile} implemente l'interface {@link ISymptomWriter}
 * </ul>
 * <p>
 * <b>Contient 3 methodes d'appels {Class outils} pour effectuer le traitement et l'analyse</b><br>
 * Déclare les methodes respective : getSymptomsList(), getCountedList(), getWritedList().
 * <ul>
 * <li> getSymptomsList() {@link ISymptomReader#getSymptoms()}
 * <li> getCountedList() {@link ISymptomCounter#getSymptomsCounted(List)}
 * <li> getWritedList() {@link ISymptomWriter#getSymptomsWrited(TreeMap)}
 * </ul>
 * <p>
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
	 * <p>
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

	/**
	 * <p>
	 * <b>Declare la methode (symptomsReader) lecture via l'interface ISymptomReader</b>
	 * </p>
	 * @return symptomsReader à la methode symptomsReader.symptomsReader()
	 */
	public ISymptomReader symptomsReader()
	{
		this.symptomsReader = symptomsReader();
		return symptomsReader;
	}
	/**
	 * <p>
	 * <b>Declare la methode (symptomsCounter) lecture via l'interface ISymptomCounter</b>
	 * </p>
	 * @return symptomsCounter à la methode symptomsCounter.symptomsCounter()
	 */
	public ISymptomCounter symptomsCounter()
	{
		this.symptomsCounter = symptomsCounter();
		return symptomsCounter;
	}
	/**
	 * <p>
	 * <b>Declare la methode (symptomsWriter) lecture via l'interface ISymptomWriter</b>
	 * </p>
	 * @return symptomsWriter à la methode symptomsWriter.symptomsWriter()
	 */
	public ISymptomWriter symptomsWriter()
	{
		this.symptomsWriter = symptomsWriter();
		return symptomsWriter;
	}

	/**
	 * <p>
	 * <b>getSymptomsList()</b><br>
	 * Declare la methode de recuperation de liste de l'interface
	 * </p>
	 */
	public void getSymptomsList()
	{
		this.listSymptoms = symptomsReader.getSymptoms();
	}
	/**
	 * <p>
	 * <b>getCountedList()</b><br>
	 * Declare la methode de recuperation de la liste (listSymptoms) en TreeMap de l'interface
	 * </p>
	 *
	 * @throws Exception Try / catch
	 */
	public void getCountedList() throws Exception
	{
		this.listSymptomsCounted = symptomsCounter.getSymptomsCounted(listSymptoms);
	}
	/**<p>
	 * <b>getWritedList()</b><br>
	 * Declare la methode d'ecriture de la TreeMap (listSymptomsCounted)
	 * </p>
	 *
	 * @throws Exception Try / catch
	 */
	public void getWritedList() throws Exception
	{
		this.symptomsWriter.getSymptomsWrited(listSymptomsCounted);
	}
}