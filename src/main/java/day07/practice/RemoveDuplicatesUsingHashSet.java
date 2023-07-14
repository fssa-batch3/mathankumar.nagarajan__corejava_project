package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesUsingHashSet {
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<>();
		
		arrList.add(0);
		arrList.add(1);
		arrList.add(1);
		arrList.add(2);
		arrList.add(2);
		arrList.add(5);
		
		System.out.println(arrList);
		
		HashSet<Integer> setOfNum = new HashSet<Integer>(arrList);
		System.out.println(setOfNum);
		
		
	}

}
