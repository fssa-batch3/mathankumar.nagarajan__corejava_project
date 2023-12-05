
public class Interview {
	
	public static void main(String[] args) {
		
		int totalSpace = 100;
		int s = 40;
		int emptySpace = totalSpace - s;
		int[] arr = {10,20,30,40};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length-1; j++) {
				
				int total = arr[i] + arr[j];
				
				if(total == emptySpace) {
					System.out.println(arr[i] + " " + arr[j]);
				}
				
			}
			
		}
		
	}

}
