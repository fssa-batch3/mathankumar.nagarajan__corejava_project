package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesUsingHashSet {
	
	public static boolean addvaluetoarray(ArrayList<Integer> arrList) throws IllegalArgumentException {

		if(arrList == null) {
			throw new IllegalArgumentException("ArrayList Cann't be Null");
		}
		
		arrList.add(0);
		arrList.add(1);
		arrList.add(1);
		arrList.add(2);
		arrList.add(2);
		arrList.add(5);
		System.out.println(arrList);
		
		
		
		removeduplicatetoarraylist(arrList);
		
		return true;
		
	}
	
	public static boolean removeduplicatetoarraylist(ArrayList<Integer> arrList) throws IllegalArgumentException {
		
		if(arrList == null) {
			throw new IllegalArgumentException("ArrayList Cann't be Null");
		}
		
		HashSet<Integer> setOfNum = new HashSet<Integer>(arrList);
		System.out.println(setOfNum);
		
		return true;
	
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<>();
		
		
		addvaluetoarray(arrList);
		
		
	}

}