import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {
		Locker<String> string = new Locker<>();
		
		string.setValue(":)");
		
		System.out.println(string.getValue());
		
		Locker<Integer> number = new Locker<>();
		
		number.setValue(5);
		
		System.out.println(number.getValue());
		
		Locker<Random> random = new Locker<>();
		
		random.setValue(new Random());
		
		System.out.println(random.getValue().nextDouble());
	}
}
