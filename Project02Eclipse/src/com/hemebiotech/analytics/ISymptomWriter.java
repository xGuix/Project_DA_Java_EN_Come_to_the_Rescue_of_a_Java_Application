package com.hemebiotech.analytics;

import java.util.TreeMap;

public interface ISymptomWriter {
	
	TreeMap<String, Integer> getSymptomsWrited(TreeMap<String, Integer> listSymptomsCounted) throws Exception;
}