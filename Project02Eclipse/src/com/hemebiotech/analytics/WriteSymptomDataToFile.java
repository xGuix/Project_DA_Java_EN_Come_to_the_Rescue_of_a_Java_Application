package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WriteSymptomDataToFile implements ISymptomWriter {
	
	private String filepath;
	public WriteSymptomDataToFile(String filepath) {
		this.filepath = filepath;
	}

	public TreeMap<String,Integer> getSymptomsWrited() throws IOException {
		
		FileWriter writer = new FileWriter ("result.out");
		TreeMap<String,Integer> listWrited = new TreeMap<String,Integer>();
		
		for(Entry<String, Integer> entry : listWrited.entrySet()){
					String lineMap = entry.getKey();
					Integer iMap = entry.getValue();

					System.out.println(iMap + " / " + lineMap);
					writer.write("Line N°" + iMap + " - Symptom : " + lineMap);
					writer.write(System.lineSeparator());

					if (lineMap == null) {
						writer.close();
						return listWrited;
					}
		writer.close();
		}
		return listWrited;
	}

	public TreeMap<String, Integer> getSymptomsWrited(TreeMap<String,Integer> listSymptomsCounted)throws Exception{
		return getSymptomsWrited();
	}
}