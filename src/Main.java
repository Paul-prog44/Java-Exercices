import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		TodoList2 list = new TodoList2();
		Scanner scanner = new Scanner(System.in);
		
		UserInterfaceTodoList2 UiTodo = new UserInterfaceTodoList2(list, scanner);
		
		UiTodo.start();
	}
}
