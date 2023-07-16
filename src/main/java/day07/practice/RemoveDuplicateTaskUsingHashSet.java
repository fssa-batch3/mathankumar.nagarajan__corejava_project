package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

class Task {

	// Created Getter and Setter Methods for the Attributes
	private int id;
	private String name;
	private LocalDate deadline;

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

	public Task(int id, String name, LocalDate deadline) {

		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

}

public class RemoveDuplicateTaskUsingHashSet {

	public static boolean removeduplicates(ArrayList<Task> tasks) throws IllegalArgumentException {
		
		if(tasks == null) {
			throw new IllegalArgumentException("HashSet is connot be null");
		}

		HashSet<Task> hashOfSet = new HashSet<Task>(tasks);

		System.out.println(hashOfSet);

		return true;

	}

	public static boolean addTaskToArray(ArrayList<Task> taskList) throws IllegalArgumentException {

		if (taskList == null) {
			throw new IllegalArgumentException("ArrayList Is Cann't Be Null");
		}

		String day1 = "2023-07-14";
		LocalDate date1 = LocalDate.parse(day1);
		Task t1 = new Task(1, "Read Books", date1);

		taskList.add(t1);
		taskList.add(new Task(2, "Read Notes", date1));
		taskList.add(t1);
		taskList.add(new Task(3, "Learn Java", date1));

		removeduplicates(taskList);

		return true;

	}

	public static void main(String[] args) {

		ArrayList<Task> taskList = new ArrayList<>();
		
		addTaskToArray(taskList);

	}

}
