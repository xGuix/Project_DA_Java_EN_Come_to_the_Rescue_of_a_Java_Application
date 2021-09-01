package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WriteSymptomDataToFile implements ISymptomWriter
{
	private String filepath;
	public WriteSymptomDataToFile(String filepath)
	{
		this.filepath = filepath;
	}

	public void getSymptomsWrited(TreeMap<String,Integer> listSymptomsCounted) throws Exception
	{
		FileWriter writer = new FileWriter (filepath);
		
		for(Entry<String, Integer> entry : listSymptomsCounted.entrySet()){
				String symptom = entry.getKey();
				Integer count = entry.getValue(); 
				
				writer.write(String.format("Symptom / "+"%30s", symptom +" =[ "+ String.format("%02d",count) +" ] "));
				writer.write(System.lineSeparator());
		}
		writer.close();
	}
}