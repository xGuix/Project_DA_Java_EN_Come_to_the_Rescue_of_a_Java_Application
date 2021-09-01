package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;
/**
 * <b> Interface ISymptomCounter</b>
 * <p> Permet de récuperer la liste des symptoms {@link ObjAnalyser.listSymptoms}<br>
 *     Retourne une liste TreeMap  clé/valeur  {@link ObjAnalyser.listSymptomsCounted} <br>
 * </p><p>
 * Les doublons sont comptés et la liste est ordonne par ordre alphabetique.
 * </p>
 * 
 * @see CountSymptomDataFromFile
 * 
 * @author xGuix
 * @version v1.0
 */
public interface ISymptomCounter {
	/**
	 * <b>Si aucune data n'est présente, renvoi une liste vide.</b>
	 * </p>
	 * @param listSymptoms<br>
	 * Prend tous les symptoms extraits de la liste brute.
	 * @return getSymptomsCounted<br> 
	 * Trie et compte de la listSymptoms et retourne : clé = symptoms & Valeur = nombre de fois (symptom). 
	 * @throws Exception Try / catch
	 * </p>
	 */
	TreeMap<String, Integer> getSymptomsCounted(List<String> listSymptoms) throws Exception;
}