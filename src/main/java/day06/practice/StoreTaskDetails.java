package day06.practice;

import java.util.ArrayList;
import java.util.List;

class Task {
	
	public String taskName;
    
    public int priority;
	 
    public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Task(String taskName, int priority){
		this.taskName = taskName;
		this.priority = priority;
	}
	
     
}

public class StoreTaskDetails {
	
	public static void main(String[] args) {
		
		Task t1 = new Task("Test", 12);
		
		List<Task> taskList = new ArrayList<Task>();
		
		taskList.add(t1);
		
		System.out.println(taskList.get(0).taskName);
		
	}

}
