package skillenza.societegenerale.setoperation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;	

public class Solution {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);

		Integer testcase = in.nextInt();

		while(testcase > 0)
		{
			Integer setALimit = in.nextInt();
			Integer setBLimit = in.nextInt();
			
			
			Set<Integer> setA = new HashSet<>();
			Set<Integer> setB = new HashSet<>();
			
			getSetValues(in, setALimit, setA);
			getSetValues(in, setBLimit, setB);

			Integer scenario = in.nextInt();
			
			String result = performSetOperation(setA, setB, scenario).toString();
			System.out.println(result.replaceAll("\\[", "\\{").replaceAll("\\]","\\}"));
			
			testcase--;
		}
		
	}

	public static void getSetValues(Scanner in, Integer setALimit, Set<Integer> setA) {
		while(in.hasNextLine() && setALimit > 0)
		{
			StringTokenizer strTokens = new StringTokenizer(in.nextLine(), " ");
			
			while(strTokens.hasMoreTokens())
			{
				setA.add(Integer.valueOf(strTokens.nextToken()));
				setALimit--;
			}
		}
	}

	private static Set<Integer> performSetOperation(Set<Integer> setA, Set<Integer> setB, Integer scenario) {

		Set<Integer> toRet = new TreeSet<>();
		
		if(scenario.equals(1))
		{
			setA.retainAll(setB);
			return new TreeSet<>(setA);
		}
		else if(scenario.equals(2))
		{
			setA.addAll(setB);
			return new TreeSet<>(setA);
		}
		else if(scenario.equals(3))
		{
			toRet.addAll(setA);
			toRet.addAll(setB);
			setA.retainAll(setB);
			toRet.removeAll(setA);
			return toRet;
		}
		else if(scenario.equals(4))
		{
			toRet.clear();
			toRet.addAll(setA);
			setA.retainAll(setB);
			toRet.removeAll(setA);
			return toRet;
		}
		else if(scenario.equals(5))
		{
			toRet.clear();
			toRet.addAll(setB);
			setB.retainAll(setA);
			toRet.removeAll(setB);
			return toRet;
		}
		else
		{
			return null;
		}
	}
	
}
