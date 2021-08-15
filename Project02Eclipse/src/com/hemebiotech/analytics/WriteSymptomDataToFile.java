package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptomDataToFile implements ISymptomWriter {

	Map<Integer, String> SymptomsListCounter = new HashMap<Integer, String>();
	
	public WriteSymptomDataToFile() throws IOException {
		FileWriter writer = new FileWriter ("result.out");
		for(
				Iterator<Entry<Integer, String>> iterator = SymptomsListCounter.entrySet().iterator();iterator.hasNext();)
				{
					Entry<Integer, String> entry = iterator.next();
					int iMap = entry.getKey();
					String lineMap = entry.getValue();

					System.out.println(iMap + " - " + lineMap);
					writer.write("Line N°" + iMap + " - Symptom : " + lineMap);
					writer.write(System.lineSeparator());

					if (lineMap == null) {
						writer.close();
						return;
					}
				}
	} 	
}
