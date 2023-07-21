package day12.practice;

public class TaskValidator {
	
	public static boolean validate(Task task) {
		
		if(task.name == null || "".equals(task.name)) {
			throw new IllegalArgumentException("Task name can't be null or empty");
		}
		
		if(task.status == null || "".equals(task.status)) {
			throw new IllegalArgumentException("Task Status Can't Be Null or Empty");
		}
		
		return true;
		
	}
	
}
