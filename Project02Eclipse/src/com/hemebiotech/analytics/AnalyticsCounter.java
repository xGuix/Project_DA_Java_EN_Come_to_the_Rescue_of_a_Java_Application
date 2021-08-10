package com.hemebiotech.analytics;


public class AnalyticsCounter implements ObjAnalyser {
	
	public static void main(String args[]) throws Exception {
			
		ObjAnalyser Analyse = new ObjAnalyser (new ReadSymptomDataFromFile(GetSymptoms));
		Analyse.GetSymptoms( );
		
		
	}
}