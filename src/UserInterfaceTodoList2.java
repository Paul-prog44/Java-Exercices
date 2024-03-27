import java.util.Scanner;

public class UserInterfaceTodoList2 {
	TodoList2 todoList;
	Scanner scanner;
	
	public UserInterfaceTodoList2(TodoList2 todoList, Scanner scanner) {
		this.todoList = todoList;
		this.scanner = scanner;
	}
	
	public void start() {
		while (true) {
			System.out.println("Command :");
			String command = scanner.nextLine();
			
			if (command.equals("stop")) {
				break;
			}
			
			if (command.equals("add")) {
				System.out.print("To add:");
				String title = scanner.nextLine();
				todoList.add(title);
			}
			
			if (command.equals("list")) {
				todoList.print();
			}
			
			if (command.equals("remove")) {
				System.out.print("Which task is to be removed: ");
				int toBeRemoved = Integer.valueOf(scanner.nextLine());
				todoList.remove(toBeRemoved);
			}
		}
	}
}
