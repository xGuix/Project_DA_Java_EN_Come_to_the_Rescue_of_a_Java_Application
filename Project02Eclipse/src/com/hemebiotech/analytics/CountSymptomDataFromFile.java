package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.sound.sampled.Line;

public class CountSymptomDataFromFile implements ISymptomCounter
{
	private String filepath;
	public CountSymptomDataFromFile(String filepath)
	{
		this.filepath = filepath;
	}
	
	public TreeMap<String, Integer> getSymptomsCounted(List<String> listSymptoms) throws Exception
	{
		TreeMap<String, Integer> counter = new TreeMap<String,Integer>();

		if (filepath != null)
		{
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String count = reader.readLine();
				Integer symptomNumber = 0;
				for (String symptom : listSymptoms)
				{
					count=symptom;
					// System.out.println("Symptoms : "+ symptom);
					if (count.equals(symptom))
					{
					symptomNumber++;
					counter.put(symptom,symptomNumber);
					symptomNumber = Integer.valueOf(symptomNumber);
					// System.out.println(count);
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