package day08.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class DepNameOfEmployees {
	
	public static boolean depnameofemployees(ArrayList<String> depOfEmp) throws IllegalArgumentException {
		
		Scanner sc = new Scanner(System.in);
		
		if(depOfEmp == null) {
			throw new IllegalArgumentException("Given ArrayList Cann't be Null");
		}
		
		
		Map<String, List<String>> depMap = new TreeMap<>();
		
		System.out.println("Enter Input Like: HR, Name");
		
		
		for(int i=0; i<depOfEmp.size(); i++) {
			String str = depOfEmp.get(i);
			
			
//		while(sc.hasNext()) {
			
//			String str = sc.nextLine();
			
//			if("stop".equals(str)) {
//				break;
//			}
			
			
			if(str == null|| "".equals(str.trim())) {
				throw new IllegalArgumentException("Input cann't be Empty or Null");
			}
			
			String[] arrDepName = str.split(",");
			
//			if(arrDepName == null) {
//				throw new IllegalArgumentException("User Given String Must have ',' and Conn't be Null");
//			}
			
			if(arrDepName.length < 2 || arrDepName.length > 2) {
				throw new IllegalArgumentException("Input Must hava Department and the Employee Name");
			}

			
			if(depMap.get(arrDepName[0]) == null) {
				depMap.put(arrDepName[0], new ArrayList<>());
				depMap.get(arrDepName[0]).add(arrDepName[1]);
			}else {
				depMap.get(arrDepName[0]).add(arrDepName[1]);
			}
			
		}
		
//Collections.sort();
		
		for(Map.Entry<String, List<String>> e : depMap.entrySet()) {
			
			String depName = e.getKey();
			Collections.sort(e.getValue());
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<e.getValue().size(); i++) {
				
				if(i==0) {
					sb.append(e.getValue().get(i));
				}
				else {
					sb.append(", " + e.getValue().get(i));
				}
				
			}
			
			
			
			System.out.println(depName + ": " + sb);
			
		}
		
		sc.close();
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		
		depnameofemployees(new ArrayList<String>());
		
	}

}
