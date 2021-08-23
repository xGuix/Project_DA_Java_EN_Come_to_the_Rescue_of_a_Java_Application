package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class CountSymptomDataFromFile implements ISymptomCounter {

	private String filepath;
	
	public CountSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}
	
	public TreeMap<String, Integer> getSymptomsCounted() {
		TreeMap<String, Integer> Counter = new TreeMap<String,Integer>();

		if (filepath != null) {
			try {
				BufferedReader counter = new BufferedReader(new FileReader(filepath));
				String count = counter.readLine();
				for (int i = 0; count != null; i++) {
					count = counter.readLine();
					System.out.println("ligne : " + i);
					System.out.println("Symptoms : " + count);
					System.out.println();

					if (count == null) {
						counter.close();
					}
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		return Counter;
	}

	public TreeMap<String, Integer> getSymptomsCounted(List<String> listSymptoms) {
		return getSymptomsCounted();
	}
}