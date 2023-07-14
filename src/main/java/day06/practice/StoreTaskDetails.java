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



public class StoreTaskDetails  {


	
	public static boolean addTaskToArrayList(Task task) throws IllegalArgumentException {
		
		if(task.priority <= 0 || task.priority > 5) {
			throw new IllegalArgumentException("Task Priority must be have 1 to 5");
		}
		
		if(task.taskName == null || "".equals(task.taskName)) {
			throw new IllegalArgumentException("Task Name Cann't be Empty or Null");
		}
		
		
		
		List<Task> taskList = new ArrayList<Task>();
		
		taskList.add(task);
		
//		System.out.println(taskList);
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		
//		Task task = new Task("Mathan", 10);
//		addTaskToArrayList(task);
		
	}


}
