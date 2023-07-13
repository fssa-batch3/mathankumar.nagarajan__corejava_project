package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Chennai");
		cityList.add("Mumbai");
		
		// Add logic to remove the duplicate Array and 
		// store the unique city name is an another ArrayList

		List<String> outputList = new ArrayList<String>();

		for(int i=0;i<cityList.size();i++) {
			
			int checkListCount=0;
			
			for(int j=0;j<outputList.size();j++) {	
			
				if(cityList.get(i).equals(outputList.get(j))) {
					checkListCount+=1;			
				
				}
			}
			
			if(checkListCount<1) {
				outputList.add(cityList.get(i));
			}
		}
		
		System.out.println(outputList);
		
	}

}
