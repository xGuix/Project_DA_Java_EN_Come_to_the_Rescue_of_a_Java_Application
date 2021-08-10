package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;


public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		BufferedReader reader = new BufferedReader (new FileReader("/Users/guillaumebrenot/Git/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt"));
		String line = reader.readLine();

		int i = 0;	// set i to 0
		int headCount = i;
		int rashCount = i;
		
		
		while (line !=null) {
			i++;	// increment i
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rash")) {
				rashCount++;
				System.out.println("number of rashs: " + rashCount);
			}
		
			line = reader.readLine();	// get another symptom
		}
}}