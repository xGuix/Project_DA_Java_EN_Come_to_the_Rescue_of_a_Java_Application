package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class CountSymptomDataFromFile implements ISymptomCounter
{
	private String filepath;
	public CountSymptomDataFromFile(String filepath)
	{
		this.filepath = filepath;
	}
	
	public TreeMap<String, Integer> getSymptomsCounted(List<String> listSymptoms)
	{
		TreeMap<String, Integer> counter = new TreeMap<String,Integer>();

		if (filepath != null)
		{
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String count = reader.readLine();
				for (String symptom : listSymptoms)
				{
					count = reader.readLine();
					System.out.println("Symptoms : "+ symptom);
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