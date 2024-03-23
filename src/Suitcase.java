import java.util.ArrayList;

public class Suitcase {
	private ArrayList<Item> itemList;
	private int maxWeight;
	
	public Suitcase(int maxWeight) {
		this.itemList = new ArrayList<>();
		this.maxWeight = maxWeight;
	}
	
	public void addItem(Item item) {
		this.itemList.add(item);
	}
	
	public String toString() {
		if (this.itemList.size() == 0) {
			return "no items (0kg)";
		}
		
		if (this.itemList.size() == 1) {
			return this.itemList.size() + " item (" + this.itemList.get(0).getWeight() + "kg)";
		}
		
		int totalWeight = 0;
		for (Item item: itemList) {
			if (totalWeight+item.getWeight() <= maxWeight) {
				totalWeight += item.getWeight();
			}
		}
		
		return this.itemList.size() + " items (" + totalWeight + "kg)";
	}
	
	public void printItems() {
		for (Item item:itemList) {
			System.out.println(item.getName() + " (" + item.getWeight() + "kg)");
		}
	}
	
	public int totalWeight() {
		int totalWeight = 0;
		for (Item item: itemList) {
			if (totalWeight+item.getWeight() <= maxWeight) {
				totalWeight += item.getWeight();
			}
		}
		return totalWeight;
	}
	
	public Item heaviestItem() {
		if (itemList.isEmpty()) {
			return null;
		}
		
		Item heaviestItem = itemList.get(0);
		for (Item item: itemList) {
			if (item.getWeight() > heaviestItem.getWeight()) {
				heaviestItem = item;
			}
		}
		
		return heaviestItem;
	}
}
