import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;



public class Main {
	
	public static void main(String[] args) {
		Box1 box = new Box1(10);
		Box1 box2 = new Box1(11);
		Box1 box3 = new Box1(15);


	    box.add(new Book2("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
	    box.add(new Book2("Robert Martin", "Clean Code", 1));
	    box.add(new Book2("Kent Beck", "Test Driven Development", 0.7));

	    box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
	    box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
	    box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

	    box2.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
	    box2.add(new CD("Blabla", "Closer to sdgfd Here", 2012));
	    box2.add(new Book2("Kent Beck", "Test Driven Development", 0.7));

	    
	    box2.add(box);
	    box3.add(box2);
	    System.out.println(box);
	    System.out.println(box2);
	    System.out.println(box3);
	    
	   

	}
}
