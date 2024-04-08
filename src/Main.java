import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;



public class Main {
	
	
	public static void main(String[] args) {
		NoiseCapable dog = new Dog();
		dog.makeNoise();
		
		NoiseCapable cat = new Cat("Garfield");
		cat.makeNoise();
		Cat c = new Cat();
		c.purr();
	}
}
