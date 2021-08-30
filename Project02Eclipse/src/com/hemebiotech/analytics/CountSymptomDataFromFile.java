package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class CountSymptomDataFromFile implements ISymptomCounter
{
	private String filepath;
	// Je creer ma methode pour lire la liste en memoire symptomList
	public CountSymptomDataFromFile(String filepath)
	{
		this.filepath = filepath;
	}
	// Je creer ma methode TreeMap pour recuperer la listSymptoms
	public TreeMap<String, Integer> getSymptomsCounted(List<String> listSymptoms) throws Exception
	{
		// J'instancie ma TreeMap counter pour recuperer le r�sultat du triage et du comptage
		TreeMap<String, Integer> counter = new TreeMap<String,Integer>();
		// Je créer mes conditions d'analyse et de comptage tant que les lignes ne renvoient pas null
		if (filepath != null)
		{
			try {
				// J'instancie mon Reader pour lire les lignes de ma listSymptom
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				// Je déclare count pour lire et compter mes symptoms
				String count = reader.readLine();
				// Je déclare mon integer pour le comptage
				Integer numberOfsymptom = 1;
				// Je cree une boucle de lecture listSymptomms pour les recuperer
				for (String symptom : listSymptoms)
				{	
					// J'ajoute chaque ligne à ma TreeMap counter
					counter.put(symptom, numberOfsymptom);
					// J'utilise count pour comparer les symptoms
 					count = counter.lastKey();
					// Booleen pour répondre False quand les symptoms sont differents
					if (symptom != count)
					{
						numberOfsymptom++;
					}
					else
					{
						numberOfsymptom = 0;
					}
				}
				reader.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		return counter;
	}
}