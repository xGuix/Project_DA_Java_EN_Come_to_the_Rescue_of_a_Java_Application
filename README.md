# Project AnalyticsCounter V1.0
***
Application Heme Biotech pour l'analyse des effets secondaires identifier par les utilisateurs de nos produits.

## But de l'application
***
**Recuperer une liste de symptoms d'un fichier texte pour l'analyser et renvoyer un fichier de symptoms compte et trie.**<br>
- L'application lit ligne par ligne le fichier txt (inputFile) dans le dossier racine du programme
- L'application compte les occurances et ordonne par ordre alphabetique, renvoi une liste de symptom en TreeMap Key/Value
- L'application ecrit un fichier texte formaté result.out (outputFile) dans le dossier racine du programme

### Class Main {AnlyticsCounter}
***
** Intance de la Class Objet & Intance des 3 implementations**

Class {ObjAnalyser} appelle ses trois methodes :
 - getSymptomsList()
 - getCountedList()
 - getWritedList()

Instance des Class implementantes : Type de source
- ReadSymptomsDataFromFile (filepath fichier in)
- CountSymptomsDataFromList (utilise les données en mémoire)
- WriteSymptomsDataToFile (filepath fichier out)

### Utilisation des 3 intefaces
***
- Comment lire un fichier ?
ISymptomReader (List de String)

- Comment compter et trier?
ISymptomCounter (TreeMap Key/Value)

- Comment ecrire un fichier ?
ISymptomWriter (void)

#### Evolution possible
***
Ajout de nouvelles class implementions possible (Base de Donnee : ReadSymptomsDataFromDataBase)