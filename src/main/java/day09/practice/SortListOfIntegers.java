package day09.practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortListOfIntegers {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(8);
		intList.add(9);
		intList.add(45);
		intList.add(12);
		intList.add(1);
		
		Collections.sort(intList);
		
		System.out.print("Output: ");
		
		for(int i=0; i<intList.size(); i++) {
			System.out.print(intList.get(i) + " ");
		}
		
		
	}

}
