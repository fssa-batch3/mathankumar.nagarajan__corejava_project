package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


	
class Task1 {
				
	private int id;
	private String name;
	private LocalDate deadline;
		
	public Task1(int id, String name, LocalDate deadline) {
			
		this.id = id;
		this.name = name;
		this.deadline = deadline;
			
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
	
	
	
}

class LocalDateComparator implements Comparator<Task1> {
	
	public int compare(Task1 t1, Task1 t2) {
		return t1.getDeadline().compareTo(t2.getDeadline());
	}
	
}
	
public class SortOrderTheDeadline {
	
	public static void main(String[] args) {
		
		Task1 t1 = new Task1(3, "Coding", LocalDate.parse("2022-10-22"));
		
		Task1 t2 = new Task1(5, "Product Design", LocalDate.parse("2022-10-01"));
		
		Task1 t3 = new Task1(1, "Software Design", LocalDate.parse("2022-10-07"));
		
		Task1 t4 = new Task1(3, "Coding", LocalDate.parse("2022-10-22"));
		
		
		List<Task1> list = new ArrayList<Task1>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		
		Collections.sort(list, new LocalDateComparator());
		
		Iterator<Task1> itr = list.iterator();
		while(itr.hasNext()) {
			
			Task1 tk = itr.next();
			System.out.println(tk.getId() + "," + tk.getName() + "," + tk.getDeadline());
			
		}
		
		
		
		
		
	}

}
