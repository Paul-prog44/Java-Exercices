
public class Organism implements Movable {
	int x = 0;
	int y = 0;
	
	public Organism(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x:" + this.x + "; y:" + this.y;
	}
	
	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
}
