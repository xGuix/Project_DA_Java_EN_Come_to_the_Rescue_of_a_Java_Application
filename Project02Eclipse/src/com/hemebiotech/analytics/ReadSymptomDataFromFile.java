package com.hemebiotech.analytics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * <b>Outil de lecture de fichier de fichier (texte.txt)</b>
 * <p>Simple brute force - Renvoi une liste brute sans traitement des occurence.<br>
 * Implemente l'interface {@link ISymptomReader}
 *
 * @see ISymptomReader
 *
 * @author xGuix
 * @version v1.0
 */
public class ReadSymptomDataFromFile implements ISymptomReader
{
	private String filepath;
	/**
	 * @param filepath  le chemin d'acces au fichier avec des strings (symptoms),
	 *        un symptom par ligne.
	 */
	public ReadSymptomDataFromFile(String filepath)
	{
		this.filepath = filepath;
	}

	/**
	 * <b>Déclaration de la methode (getSymptoms) de l'interface ISymptomReader</b><br>
	 * Liste des symptoms lu à partir du (filepath) inputFile "symptoms.txt"
	 *
	 * @return result le resultat dans une nouvelle ArrayList
	 */
	@Override
	public List<String> getSymptoms()
	{
		// Instance ArrayList pour stocker la nouvelle liste
		ArrayList<String> result = new ArrayList<String>();
		// Lecture tant que les lignes contiennent une string
		if (filepath != null)
		{
			try
			{
				// Instance de (reader) et déclaration de (line) pour lire les lignes
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null)
				{
					// Ajoute chaque ligne à la liste (result)
					result.add(line);
					line = reader.readLine();
				}
				// Ferme le reader
				reader.close();
			}
			// catch exception
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("ReadSymptomDataFromFile Finished");
		return result;
	}
}