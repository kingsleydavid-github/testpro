package codwar.isogram;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class IsoGram {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while(in.hasNext())
		{
			String isogram = in.next();
			
			isogram.toLowerCase().chars().distinct().count();

			System.out.println(isIsogram(isogram));
		}
		

	}

	public static boolean isIsogram(String isogram) {

		Map<Character, Integer> allLetters = new TreeMap<>();
		
		for (int idx = 0; idx < isogram.length(); idx++) {
			Character letter = isogram.toLowerCase().charAt(idx);
			if (allLetters.containsKey(letter)) {
				Integer val = allLetters.get(letter) + 1;
				allLetters.put(letter, val);
			} else {
				allLetters.put(letter, 1);
			}
		}
		
		System.out.println(allLetters);
		
		return isValidIsoGram(allLetters);
	}

	private static boolean isValidIsoGram(Map<Character, Integer> allLetters) {
		
		
		Set<Entry<Character, Integer>> strEntrySet = allLetters.entrySet();
		Iterator<Entry<Character, Integer>> strItr = strEntrySet.iterator();
		
		while(strItr.hasNext())
		{
			Entry<Character, Integer> ent = strItr.next();
			if(ent.getValue() > 1)
			{
				return false;
			}
		}
		
		return true;
	}

}
