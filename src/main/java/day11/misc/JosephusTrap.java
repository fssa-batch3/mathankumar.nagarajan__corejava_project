package day11.misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JosephusTrap {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=1; i<=n; i++) {
			arr.add(i);
		}
		
		int count = 0;
		int j = 0;
		int i = 1;
		while(count != (n-1)) {
			int index = j%n;
			if(arr.get(index) != 0) {
				
				if(i%k == 0) {
					arr.set(index, 0);
					i++;
					count++;
				}else {
					i++;
				}
				
			}
			j++;
		
		}
		
		for(int e:arr) {
			if(e != 0) {
				System.out.println("Output: " + e);
			}
		}
		
		
		
		
		
	}

}
