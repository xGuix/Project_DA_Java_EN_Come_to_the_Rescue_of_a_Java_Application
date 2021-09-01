package com.hemebiotech.analytics;

import java.util.TreeMap;

public interface ISymptomWriter {
	
	void getSymptomsWrited(TreeMap<String, Integer> listSymptomsCounted) throws Exception;
}