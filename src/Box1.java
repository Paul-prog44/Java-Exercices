import java.util.ArrayList;

public class Box1 implements Packable {
	double maxWeight;
	ArrayList<Packable> packables = new ArrayList<>();
	
	public Box1(double maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	public void add(Packable itemToAdd) {
		if (this.weight() + itemToAdd.weight() <= this.maxWeight) {
			packables.add(itemToAdd);
		}
	}
	
	public double weight() {
		double weight = 0;
		for (Packable packable:packables) {
			weight += packable.weight();
		}
		return weight;
	}
	
	public String toString() {
		return "Box: "+ packables.size() +" items, total weight "+ this.weight() +" kg";
	}
}
