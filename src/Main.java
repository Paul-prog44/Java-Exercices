import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {
		try {
			PrintWriter writer = new PrintWriter("C:\\Users\\Gérald\\eclipse-workspace\\HelsinkiMOOC\\toWrite.txt");
			writer.println("Hello world");
			writer.println("More text");
			writer.print("A lot more");
			writer.print("test");
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
