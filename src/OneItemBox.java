import java.util.ArrayList;

public class OneItemBox extends Box {
	ArrayList<Item> item;
	
	public OneItemBox() {
		this.item = new ArrayList<>();
	}
	
	public void add(Item item) {
		if (this.item.size() == 0) {
			this.item.add(item);
		}
	}
	
	public boolean isInBox(Item item) {
		if (this.item.contains(item)){
			return true;
		} 
		return false;
	}
}
