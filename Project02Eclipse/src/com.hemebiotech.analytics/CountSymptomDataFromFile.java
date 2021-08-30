package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class CountSymptomDataFromFile implements ISymptomCounter
{
<<<<<<< HEAD:Project02Eclipse/src/com.hemebiotech.analytics/CountSymptomDataFromFile.java
	private String filepath;
	// Je cr�er ma methode pour lire la liste en m�moire symptomList
	public CountSymptomDataFromFile(String filepath)
	{
		this.filepath = filepath;
	}
	// Je creer ma methode TreeMap pour recuperer la listSymptoms
	public TreeMap<String, Integer> getSymptomsCounted(List<String> listSymptoms) throws Exception
	{
		// J'instancie ma TreeMap counter pour r�cuperer le r�sultat du triage et du comptage
		TreeMap<String, Integer> counter = new TreeMap<String,Integer>();
		// Je cr�er mes conditions d'analyse et de de comptage
		if (filepath != null)
		{
			try {
				// J'instancie mon Reader pour lire les lignes de ma listSymptom
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String count = reader.readLine();
				Integer numberOfsymptom = 1;
				// Je cr�e une boucle de lecture listSymptomms pour les r�cuperer
=======
// Je creer ma methode TreeMap pour recuperer la listSymptoms
	public TreeMap<String, Integer> getSymptomsCounted(List<String> listSymptoms) throws Exception
	{
		// J'instancie ma TreeMap counter pour recuperer le resultat du triage et du comptage
		TreeMap<String, Integer> counter = new TreeMap<String,Integer>();
		// Je créer mes conditions d'analyse et de comptage tant que les lignes ne renvoient pas null
		
				// Je déclare mon integer pour le comptage
				Integer InitialCount = 1;
				// Je cree une boucle de lecture listSymptomms pour les recuperer
>>>>>>> origin/Objet_&_interfaces:Project02Eclipse/src/com/hemebiotech/analytics/CountSymptomDataFromFile.java
				for (String symptom : listSymptoms)
				{	
					if (!counter.containsKey(symptom)) 
					{
					// J'ajoute chaque ligne à ma TreeMap counter
					counter.put(symptom,InitialCount);
					}
					else if (counter.containsKey(symptom))
					{
					counter.put(symptom,counter.get(symptom)+1);
					}
				}
		return counter;
	}
}