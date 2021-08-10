package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.ArrayList;


	public class ObjAnalyser<string, integer> extends AnalyticsCounter {
		
		String symptomName;
		Integer totalOfSymptoms;
		
		public ObjAnalyser(ReadSymptomDataFromFile, ISymptomsReader) {
			
		}

		public void ISymptomReader() {
			List<string> GetSymptoms = new List<string> GetSymptoms(ISymptomsReader);
			FileWriter writer = new FileWriter("result.obj");
			Writer.write(GetSymptoms + "/n");
		}
		
		
			
}