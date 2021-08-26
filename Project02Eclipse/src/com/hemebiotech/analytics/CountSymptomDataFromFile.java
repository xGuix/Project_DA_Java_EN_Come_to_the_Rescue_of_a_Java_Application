package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class CountSymptomDataFromFile implements ISymptomCounter
{
	private String filepath;
	// Je créer ma methode pour lire la liste en mémoire symptomList
	public CountSymptomDataFromFile(String filepath)
	{
		this.filepath = filepath;
	}
	// Je creer ma methode TreeMap pour recuperer la listSymptoms
	public TreeMap<String, Integer> getSymptomsCounted(List<String> listSymptoms) throws Exception
	{
		// J'instancie ma TreeMap counter pour récuperer le résultat du triage et du comptage
		TreeMap<String, Integer> counter = new TreeMap<String,Integer>();
		// Je créer me conditions d'analyse et de de comptage
		if (filepath != null)
		{
			try {
				// J'instancie mon Reader pour lire les lignes de ma listSymptom
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String count = reader.readLine();
				Integer symptomNumber = 0;
				// Je crée une boucle de lecture listSymptomms pour les récuperer
				for (String symptom : listSymptoms)
				{	
					count=symptom;
					count.compareTo(symptom);
					// J'ajoute chaque ligne à ma TreeMap 
					counter.put(symptom,symptomNumber);

					// Je compare ma nouvelle entrée à la précedente
					if (symptom.equals(count))
					{
						symptomNumber++;
						count.compareTo(symptom);
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