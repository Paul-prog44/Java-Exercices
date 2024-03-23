import java.util.ArrayList;

public class TodoList {
	ArrayList<String> tasks;
	
	public TodoList() {
		this.tasks = new ArrayList<>();
	}
	
	public void add(String task) {
		tasks.add(task);
	}
	
	public void print() {
		for (String task:tasks) {
			int index = (tasks.indexOf(task)+1);
			System.out.println(index +"-"+ task);
		}
	}
	
	public void remove(int number) {
		tasks.remove(number-1);
	}
}
