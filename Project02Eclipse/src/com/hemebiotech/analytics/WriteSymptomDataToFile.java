package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


public abstract class WriteSymptomDataToFile implements ISymptomWriter {
	
	public WriteSymptomDataToFile(String filepath) throws IOException {
		
		FileWriter writer = new FileWriter ("result.out");
		Map<String,Integer> SymptomsCounted = new TreeMap<String,Integer>();
		
		for(Map.Entry<String, Integer> entry : SymptomsCounted.entrySet()){
					String lineMap = entry.getKey();
					Integer iMap = entry.getValue();

					System.out.println(iMap + " / " + lineMap);
					writer.write("Line N°" + iMap + " - Symptom : " + lineMap);
					writer.write(System.lineSeparator());

					if (lineMap == null) {
						writer.close();
						return;
					}
				}
	}
}
