package day06.practice;

import java.util.ArrayList;

public class FindTheTask {

	public static boolean findTaskByName(String name, ArrayList<Task> tasks) throws IllegalArgumentException {

		if((null) == (name) || "".equals(name)) {
			throw new IllegalArgumentException("Task Name is can't be null or empty");
		}
		
		if(tasks == (null) || "".equals(tasks)) {
			throw new IllegalArgumentException("Task Object is can't be null or empty");
		}
		
		for (int i = 0; i < tasks.size(); i++) {
			if (name.equals(tasks.get(i).taskName)) {
				return true;
			}

		}
		throw new IllegalArgumentException("Given Task Name Is Not Finded");

	}

	public static ArrayList<Task> myArray() {

		ArrayList<Task> taskList = new ArrayList<Task>();

		taskList.add(new Task("TT", 10));
		taskList.add(new Task("FPT", 8));
		taskList.add(new Task("FPP", 7));
		taskList.add(new Task("TP", 9));
		
		return taskList;

	}

	
}