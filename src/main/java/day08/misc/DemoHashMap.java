package day08.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrNames = new ArrayList<String>();
		
		arrNames.add("Mathan");
		arrNames.add("Balaji");
		arrNames.add("Mathan");
		arrNames.add("Sri");
		arrNames.add("Mathan");
		arrNames.add("Sri");
		arrNames.add("Mathan");
		
		Map <String, Integer> countMap = new HashMap<String, Integer>();
		
		for(int i=0; i<arrNames.size(); i++) {
			
			int count = 1;
			
			if(countMap.get(arrNames.get(i)) == null) {
				countMap.put(arrNames.get(i), 1);
			}else {
				count++;
				countMap.get(arrNames.get(i));
				countMap.put(arrNames.get(i), count);
				
			}
			
		}
		
		System.out.println(countMap);
		
	}

}
