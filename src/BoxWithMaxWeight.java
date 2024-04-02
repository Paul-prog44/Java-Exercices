import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
	int capacity = 0;
	int currentWeight = 0;
	ArrayList<Item> items = new ArrayList<>();
	
	public BoxWithMaxWeight(int capacity) {
		this.capacity = capacity;
	}
	
	public void add(Item item) {
		if (item.getWeight() + currentWeight <= this.capacity ) {
			items.add(item);
			this.currentWeight += item.getWeight();
		}
	}
	
	public boolean isInBox(Item item) {
		if (items.contains(item)) {
			return true;
		}
		
		return false;
	}
	
	public void showList() {
		System.out.println(this.items);
	}
}
