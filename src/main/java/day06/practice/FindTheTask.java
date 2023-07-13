package day06.practice;


import java.util.ArrayList;

public class FindTheTask {

	static boolean findTaskByName(String name, ArrayList<Task> tasks) {
		
		for(int i=0;i<tasks.size();i++) {
			if(name.equals(tasks.get(i).taskName)) {
				return true;
			}
			
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Task> taskList = new ArrayList<Task>();
		
		taskList.add(new Task("TT", 10));
		taskList.add(new Task("FPT", 8));
		taskList.add(new Task("FPP", 7));
		taskList.add(new Task("TP", 9));
		
		
		
		System.out.println(findTaskByName("TT",taskList));
		
		
		System.out.println(findTaskByName("TP",taskList));
	}
}