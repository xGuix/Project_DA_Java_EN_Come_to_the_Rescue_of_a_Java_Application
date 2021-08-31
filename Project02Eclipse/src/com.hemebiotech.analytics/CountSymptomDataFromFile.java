package com.hemebiotech.analytics;
package com.*;

import java.util.List;
import java.util.TreeMap;

public class CountSymptomDataFromFile implements ISymptomCounter
{
// Je creer ma methode TreeMap pour recuperer la listSymptoms
	public TreeMap<String, Integer> getSymptomsCounted(List<String> listSymptoms) throws Exception
	{
		// J'instancie ma TreeMap counter pour recuperer le resultat du triage et du comptage
		TreeMap<String, Integer> counter = new TreeMap<String,Integer>();
				// Je déclare mon integer pour le comptage
				Integer InitialCount = 1;
				// Je cree une boucle de lecture listSymptomms pour les recuperer
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