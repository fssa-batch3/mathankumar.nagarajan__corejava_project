package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


	
class Task {
				
	private int id;
	private String name;
	private LocalDate deadline;
	private int priority;
		
	public Task(int id, String name, LocalDate deadline, int priority) {
			
		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.priority = priority;
			
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	
	
}

class LocalDateComparatorAndPriority implements Comparator<Task> {
	
	@Override
	public int compare(Task t1, Task t2) {
		
		if(t1.getDeadline().equals(t2.getDeadline())) {
			
			return Integer.compare(t1.getPriority(), t2.getPriority());
			
		}else {
			return t1.getDeadline().compareTo(t2.getDeadline());
		}
	}
	
}
	
public class SortOrderUsingPriorityAndDeadline {
	
	public static void main(String[] args) {
		
		Task t1 = new Task(3, "Coding", LocalDate.parse("2022-10-22"), 5);
		
		Task t2 = new Task(5, "Product Design", LocalDate.parse("2022-10-01"), 2);
		
		Task t3 = new Task(1, "Software Design", LocalDate.parse("2022-10-07"), 3);
		
		Task t4 = new Task(3, "Writing", LocalDate.parse("2022-10-22"), 1);
		
		
		List<Task> list = new ArrayList<Task>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		
		Collections.sort(list, new LocalDateComparatorAndPriority());
		
		Iterator<Task> itr = list.iterator();
		while(itr.hasNext()) {
			
			Task tk = itr.next();
			System.out.println(tk.getId() + "," + tk.getName() + "," + tk.getDeadline());
			
		}
		
		
		
		
		
	}

}
