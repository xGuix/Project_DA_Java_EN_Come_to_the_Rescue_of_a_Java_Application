package com.hemebiotech.analytics;

import java.util.TreeMap;
/**
 * <b> Interface ISymptomWriter</b>
 * <p> Methode vide permettant de récuperer la TreeMap {@link ObjAnalyser.listSymptomsCounted}<br>
 *     Retourne une liste TreeMap clé/valeur à la Methode getSymptomWrited pour ecrire le fichier "result.out" <br>
 * </p>
 * 
 * @see WriteSymptomDataToFile
 * 
 * @author xGuix
 * @version v1.0
 */
public interface ISymptomWriter {
	/**
	 * <b>Si aucune data n'est présente, renvoi une liste vide.</b>
	 * </p>
	 * @param listSymptomsCounted<br>
	 * Prend toutes les clés/valeurs de la TreeMap
	 * @return getSymptomsWrited<br>
	 * retourne une liste à ecrire dans le fichier de sortie (outputFile)
	 * @throws Exception Try / catch
	 */
	void getSymptomsWrited(TreeMap<String, Integer> listSymptomsCounted) throws Exception;
}