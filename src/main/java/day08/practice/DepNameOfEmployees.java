package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepNameOfEmployees {
	
	public static boolean depnameofemployees(ArrayList<String> depOfEmp) throws IllegalArgumentException {
		
		if(depOfEmp == null) {
			throw new IllegalArgumentException("Given ArrayList Cann't be Null");
		}
		
		
		Map<String, List<String>> depMap = new HashMap<>();
		
		System.out.println("Enter Input Like: HR, Name");
		
		
		for(int i=0; i<depOfEmp.size(); i++) {
			
			
			String str = depOfEmp.get(i);
		
			
			
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
		

		
		for(Map.Entry<String, List<String>> e : depMap.entrySet()) {
			
			String depName = e.getKey();
			List<String> empNames = e.getValue();
			
			System.out.println(depName + ": " + empNames);
			
		}
		
		
		
		return true;
		
	}
	
	

}
