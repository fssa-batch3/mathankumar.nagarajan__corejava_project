package day10.misc;

import java.util.Scanner;

public class ExceptionHanding {
	
//	public static int divider(int a, int b) throws IllegalArgumentException {
//		
//		if(b == 0) {
//			throw new IllegalArgumentException("Invalid input");
//		}
//		int c = a/b;
//		return c;
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		System.out.println(divider(1, 0));
//		
//		
//	}
	
	
	
	public static int val(int a, int b){
  		if(b == 0){
        	return 1;
        }else{
        	return a*val(a,(b-1));
        }
  }
  
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      System.out.println("The value of " + a + " power " + b + " is " + val(a,b));
      
    }

}
