package day08.practice;

import java.util.HashMap;
import java.util.TreeMap;

public class UsingHashMapToCountTheNames {

	public static boolean splitarraylist(String strNames) throws IllegalArgumentException {
		
		if(strNames == null || "".equals(strNames.trim())) {
			throw new IllegalArgumentException("Given Names String Cann't be Empty or Null");
		}
		
		String[] arrNames = strNames.split(", ");
		
		addlistusinghashmap(arrNames);
		
		return true;
		
	}
	
	public static boolean addlistusinghashmap(String[] arrNames) throws IllegalArgumentException {
		
		if(arrNames == null) {
			throw new IllegalArgumentException("Spited String Array Cann't be Null");
		}
		
		TreeMap<String, Integer> namesMap = new TreeMap<>();

		for (String e : arrNames) {

			if (namesMap.get(e) == null) {
				namesMap.put(e, 1);
			} else {
				int count = namesMap.get(e) + 1;
				namesMap.put(e, count);
			}

		}
		
		getoutput(namesMap);
		
		return true;

	}
	
	public static boolean getoutput(TreeMap<String, Integer> namesMap) throws IllegalArgumentException {
		
		if(namesMap == null) {
			throw new IllegalArgumentException("HashMap ArrayList Cann't be Null");
		}
		
		
		for (HashMap.Entry<String, Integer> e : namesMap.entrySet()) {

			String name = e.getKey();
			int val = e.getValue();

			System.out.println(name + ": " + val);

		}

		return true;
		
	}

//	public static void main(String[] args) {
//
//		String strNames = "Ram, Ram, Superman, Spider, hey, hello, hey, Spider";
//		
//		splitarraylist(strNames);
//
//	}

}
