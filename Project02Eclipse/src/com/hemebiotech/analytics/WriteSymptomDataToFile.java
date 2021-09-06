package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map.Entry;
import java.util.TreeMap;
/**
 * <b>Outil d'ecriture de TreeMap vers fichier (texte.out)</b>
 * <p>Ecrit le contenu de listSymptomsCounted dans le fichier OutputFile (filepath)
 * Implemente l'interface {@link ISymptomWriter}
 *
 * @see ISymptomWriter
 *
 * @author xGuix
 * @version v1.0 *
 */
public class WriteSymptomDataToFile implements ISymptomWriter
{
	private String filepath;
	/**
	 * @param filepath  le chemin d'acces au fichier de sortie outputFile "result.out",
	 *        contient les valeurs (symptom) et les clés (nombre de fois symptom).
	 */
	public WriteSymptomDataToFile(String filepath)
	{
		this.filepath = filepath;
	}

	/**
	 * <b>Déclaration de la methode (getSymptomsWrited) de l'interface ISymptomWriter</b><br>
	 * Ecrit la liste des symptoms clés et valeurs de la TreeMap (listSymptomsCounted)
	 * Fichier de sorti via filepath = OutputFile(result.out)
	 */
	public void getSymptomsWrited(TreeMap<String,Integer> listSymptomsCounted) throws Exception
	{
		FileWriter writer = new FileWriter (filepath);
		// Boucle qui ecrit chaque ligne reçu, jusqu'à entry=null
		for(Entry<String, Integer> entry : listSymptomsCounted.entrySet()){
				String symptom = entry.getKey();
				Integer count = entry.getValue();
				// Methode write pour ecrire le fichier et methode format pour formater la sortie string et integer
				writer.write(String.format("Symptom / "+"%30s", symptom +" =[ "+ String.format("%02d",count) +" ] "));
				writer.write(System.lineSeparator());
		}
		System.out.println("WriteSymptomDataToFile Finished");
		// ferme le writer
		writer.close();
	}
}