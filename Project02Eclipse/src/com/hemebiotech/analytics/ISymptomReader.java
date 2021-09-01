package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will read symptom data from a source The important part is, the
 * return value from the operation, which is a list of strings, that may contain
 * many duplications
 * 
 * L'implementation n'a pas besoin d'être dans l'ordre
 * 
 */
public interface ISymptomReader {
	/**
	 * si aucune data n'est présente, renvoi une liste vide 
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates
	 *         are possible/probable
	 */
	List<String> getSymptoms();
}
