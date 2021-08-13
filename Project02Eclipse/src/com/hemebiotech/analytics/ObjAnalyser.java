package com.hemebiotech.analytics;

import java.util.ArrayList;

public class ObjAnalyser implements ISymptomReader {
		
		String symptomName;
		Integer totalOfSymptoms;
		Integer NumberOfEach;

		public String listOfSymptoms() {
			this.symptomName= "TestValeurDeRetour";
			
			return symptomName;
		}

		@Override
		public ArrayList<String> GetSymptoms() {
			// TODO Auto-generated method stub
			return null;
		}

}