package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CountSymptomDataFromFile implements ISymptomCounter {
		
		private String filepath;

		public CountSymptomDataFromFile (String filepath) {
			this.filepath = filepath;
		}

		public ArrayList<String> CountSymptoms() {
			ArrayList<String> Counter = new ArrayList<String>();
			
			if (filepath != null) {
				try {
					BufferedReader reader = new BufferedReader (new FileReader(filepath));
					String read = reader.readLine();
					for (int i = 0;read!=null;i++) {
						read = reader.readLine();
						System.out.println("ligne : " + i);
						System.out.println("Symptoms : " + read);
						System.out.println();
						
						if (read==null) {
							reader.close();
			           	}
					}
				} 
				
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return Counter;
		}
}