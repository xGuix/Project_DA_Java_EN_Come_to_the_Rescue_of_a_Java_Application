package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

public interface ISymptomWriter {
	
	//symptomsWriter (TreeMap<String, Integer> symptomsCounted);
	ArrayList<String> symptomsWriter(TreeMap<String, Integer> listSymptomsWriter);
}