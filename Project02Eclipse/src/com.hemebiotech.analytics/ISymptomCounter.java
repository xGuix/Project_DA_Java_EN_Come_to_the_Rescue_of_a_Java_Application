package com.hemebiotech.analytics;
package com.*;

import java.util.List;
import java.util.TreeMap;

public interface ISymptomCounter {

	TreeMap<String, Integer> getSymptomsCounted(List<String> listSymptoms) throws Exception;
}