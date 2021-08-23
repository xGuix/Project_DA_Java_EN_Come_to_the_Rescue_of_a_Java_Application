package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public interface ISymptomCounter {

	//void getSymptomsCounted(List<String> listSymptoms);
	//ArrayList<String> getSymptomsCounted();
	TreeMap<String, Integer> getSymptomsCounted(List<String> listSymptoms);
}