package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;
/**
 * <b>Outil de trie et de comptage via TreeMap</b>
 * <p>Renvoi la TreeMap (getSymptomsCounted) doublon comptabilisé et en ordre alphabetique.<br>
 * Implemente l'interface {@link ISymptomCounter}
 *
 * @see ISymptomCounter
 *
 * @author xGuix
 * @version v1.0
 */
public class CountSymptomDataFromFile implements ISymptomCounter
{
	/**
	 * <b> Class CountSymptomDataFromFile</b>
	 * <p>
	 * Creer une methode pour recuperer la listSymptoms dans une TreeMap<br>
	 * Créer les conditions d'analyse et de comptage tant que les lignes renvoient un symptom.
	 * </p>
	 *
	 * @return getSymptomsCounted Trie et compte la listSymptoms et retourne :<br>
	 * clé = symptoms / Valeur = nombre de fois (symptom).
	 */
	public TreeMap<String, Integer> getSymptomsCounted(List<String> listSymptoms) throws Exception
	{
		// Instance de la TreeMap (counter) pour recuperer le resultat du triage et du comptage
		TreeMap<String, Integer> counter = new TreeMap<String,Integer>();

				Integer InitialCount = 1;
				// Cree une boucle de lecture listSymptoms pour recuperer toutes les lignes
				for (String symptom : listSymptoms)
				{
					// Si la clé n'est pas presente
					if (!counter.containsKey(symptom))
					{
					// Ajoute chaque ligne à ma TreeMap counter
					counter.put(symptom,InitialCount);
					}
					// Si la clé est presente
					else if (counter.containsKey(symptom))
					{
						// Ajoute +1 au symptom
					counter.put(symptom,counter.get(symptom)+1);
					}
				}
		// retourne la liste triee et comptee
		return counter;
	}
}