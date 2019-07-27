package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)) {
				pearls++;
			}
		}
		return pearls;
	}
	
	public static double findTallest(List<Double> peeps) {
		double tallest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}
	
	public static String findLongestWord(List<String> words) {
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}
	
	public static boolean containsSOS(List<String> message) {
		boolean contains = false;
		for(int i = 0; i < message.size(); i++) {
			if (message.get(i).equals(" ... --- ... ")) {
				contains = true;
			}
		}
		return contains;
	}
	
	public static List<Double> sortScores(List<Double> results) {
		boolean sort = false;
		while(!sort) {
			sort = true;
			for (int i = 0; i < results.size() - 1; i++) {
				if (results.get(i+1) <= results.get(i)) {
					double tempHolder = results.get(i);
					results.set(i, results.get(i+1));
					results.set(i+1, tempHolder);
					sort = false;
				}
			}
		}
		return results;
	}
	
	public static List<String> sortDNA(List<String> dna) {
		boolean sort = false;
		while(!sort) {
			sort = true;
			for (int i = 0; i < dna.size() - 1; i++) {
				if (dna.get(i+1).length() <= dna.get(i).length()) {
					String tempHolder = dna.get(i);
					dna.set(i, dna.get(i+1));
					dna.set(i+1, tempHolder);
					sort = false;
				}
			}
		}
		return dna;
	}
	
	public static List<String> sortWords(List<String> words) {
		boolean sort = false;
		while(!sort) {
			sort = true;
			for (int i = 0; i < words.size() - 1; i++) {
				if (words.get(i).compareTo(words.get(i+1)) > 0) {
					String tempHolder = words.get(i);
					words.set(i, words.get(i+1));
					words.set(i+1, tempHolder);
					sort = false;
				}
			}
		}
		return words;
	}
}
