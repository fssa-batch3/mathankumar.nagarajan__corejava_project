package day12.practice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import day11.practice.DAOException;
import day11.solved.ConnectionUtil;

class Task {
	int id;
	String name;
	String status;

	public Task(String name, String status) {
		this.name = name;
		this.status = status;
	}

	
	public Task() {
		// TODO Auto-generated constructor stub
	}

}

class TaskDAO2 {
	

	public static Connection getConnection() {

		Connection con = null;

		String url = "jdbc:mysql://localhost:3306/task";
		String userName = "root";
		String passWord = "123456";

		try {
			con = DriverManager.getConnection(url, userName, passWord);
		} catch (Exception e) {
			throw new RuntimeException("Unable to connect database");
		}

		return con;

	}

	public static boolean createTask(Task task) throws DAOException, IllegalArgumentException {
		// Write code here to get connection
		// Create insert statement
		// Execute insert statement
		// close connection
		
		try {
			TaskValidator.validate(task);
		}catch(IllegalArgumentException e) {
			throw new IllegalArgumentException(e.getMessage());
		}

		Connection con = null;

		try {

			String query = "INSERT INTO task(name, status) values (?,?)";
			con = getConnection();

			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, task.name);
			pst.setString(2, task.status);
			pst.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Error Creating Task: ", e);
		} finally {
			ConnectionUtil.close(con, null, null);
		}
		
		return true;

	}

	public static boolean updateTask(Task task) throws DAOException {
		// Write code here to get connection
		// Create update statement using task id
		// Execute update statement using task id
		// close connection
		
		try {
			TaskValidator.validate(task);
		}catch(IllegalArgumentException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
		
		if(task.id <= 0) {
			throw new IllegalArgumentException("Task Id conn't be 0 or less then 0");
		}

		Connection con = null;

		try {

			String query = "UPDATE task SET name = ?, status = ? WHERE id = ?";
			con = getConnection();

			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, task.name);
			pst.setString(2, task.status);
			pst.setInt(3, task.id);
			pst.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Error Updating Task: ", e);
		} finally {
			ConnectionUtil.close(con, null, null);
		}
		
		return true;

	}

	public static boolean deleteTask(int taskId) throws DAOException {
		// Write code here to get connection
		// Create delete statement using task id
		// Execute delete statement using task id
		// close connection
		
		if(taskId <= 0) {
			throw new IllegalArgumentException("Task Id conn't be 0 or less then 0");
		}
		Connection con = null;

		try {

			String query = "DELETE FROM task WHERE id = ?";
			con = getConnection();

			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, taskId);
			pst.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Error Deleting Task: ", e);
		} finally {
			ConnectionUtil.close(con, null, null);
		}
		
		return true;
		
	}

	public static List<Task> getAllTasks() throws DAOException {
		
		// Write code here to get connection
		// Create a Select all query with each attribute listed as columns
		// Execute query
		// Iterate over the resultset and convert it to an ArrayList
		// close connection
		// Return the ArrayList of Tasks
		
		
		Connection con = null;
		
		try {
		
			String quary = "SELECT * FROM task";
			con = getConnection();
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(quary);
			
			List<Task> tasks = new ArrayList<>();
			
			while(rs.next()) {
				Task task = new Task();
				task.id = rs.getInt("id");
				task.name = rs.getString("name");
				task.status = rs.getString("status");
				tasks.add(task);
			}
			return tasks;
			
		}catch(SQLException ex) {
			throw new DAOException("Error fetching tasks", ex);
		}finally {
			ConnectionUtil.close(con, null, null);
		}
		
		
	}
	
	public static void main(String[] args) throws DAOException {
		
		
		List<Task> tasks = getAllTasks();
		
		for(Task e : tasks) {
			System.out.println("ID: " + e.id + ", Task Name: " + e.name + ", Task Status: " + e.status);
		}
		
		
		
	}

}
// Create Junit Test case and test the TaskDao.createTask, updateTask,
// deleteTask and getAllTasks method