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

	public TreeMap<String,Integer> getSymptomsWrited(TreeMap<String,Integer> listSymptomsCounted) throws Exception
	{
		FileWriter writer = new FileWriter (filepath);
		TreeMap<String,Integer> listWrited = new TreeMap<String,Integer>();
		
		for(Entry<String, Integer> entry : listWrited.entrySet()){
					String symptom = entry.getKey();
					Integer count = entry.getValue();

					writer.write("Symptom : " + symptom + " / " + "Nombre : " + count);
					writer.write(System.lineSeparator());

					if (symptom == null) {
						writer.close();
						return listWrited;
					}
		writer.close();
		}
		return listWrited;
	}
}