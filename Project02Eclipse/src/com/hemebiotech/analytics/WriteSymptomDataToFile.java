package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptomDataToFile implements ISymptomWriter {

	Map<Integer, String> symptoms = new HashMap<Integer, String>();
	FileWriter writer = new FileWriter ("result.out");

	for(
	Iterator<Entry<Integer, String>> iterator = symptoms.entrySet().iterator();iterator.hasNext();)
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
