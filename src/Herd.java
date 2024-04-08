import java.util.ArrayList;

public class Herd implements Movable{
	ArrayList<Movable> herd = new ArrayList<>();
	
	public void addToHerd(Movable movable) {
		herd.add(movable);
	}
	
	public String toString() {
		String positions = "";
		for (Movable organism:herd) {
			positions = positions.concat(organism.toString() + "\n");
		}
		return positions;
	}
	
	
	public void move(int dx,int dy) {
		for (Movable organism:herd) {
			organism.move(dx, dy);
		}
	}
}
