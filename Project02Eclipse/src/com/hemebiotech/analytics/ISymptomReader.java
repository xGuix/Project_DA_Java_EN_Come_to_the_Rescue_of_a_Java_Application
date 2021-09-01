package com.hemebiotech.analytics;

import java.util.List;
/**
 * <b> Interface ISymptomReader</b>
 * <p> Permet de lire ligne par ligne un fichier de symptoms et d'en retourner une liste de (String)<br>
 *     Les doublons sont laisser pour obtenir une liste brut.
 * </p>
 * La liste n'a pas besoin d'être ordonnee pour l'instant.
 * </p>
 * 
 * @see ReadSymptomDataFromFile
 * 
 * @author xGuix
 * @version v1.0
 */
public interface ISymptomReader {
	/**
	 * <b>Si aucune data n'est présente, renvoi une liste vide.</b>
	 * </p>
	 * @return La liste brut de tous les symptoms du fichier source "symtptom.txt",<br> pas de traitement, doublons possibles.
	 */
	List<String> getSymptoms();
}
