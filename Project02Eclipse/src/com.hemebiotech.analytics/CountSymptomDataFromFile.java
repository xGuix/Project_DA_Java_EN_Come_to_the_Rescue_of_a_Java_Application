package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class CountSymptomDataFromFile implements ISymptomCounter
{
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
				for (String symptom : listSymptoms)
				{	
					if (symptom != null)
					{
						counter.put(symptom, numberOfsymptom);
						numberOfsymptom++;
					}
					else
					{
						reader.readLine();
						count.compareTo(symptom);
						count.contentEquals(symptom);
						numberOfsymptom = 1;
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