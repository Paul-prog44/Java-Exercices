import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	Map<String, Item1> itemsInCart = new HashMap<>();
	
	public void add(String product, int price) {
		if (itemsInCart.containsKey(product)) {
			itemsInCart.get(product).increaseQuantity();
		} else {
			this.itemsInCart.put(product, new Item1(product, 1, price));

		}
	}
	
	public int price() {
		int price = 0;
		for (Item1 item:itemsInCart.values()) {
			price += item.price();
		}
		return price;
	}
	
	public void print() {
		for (Item1 item:itemsInCart.values()) {
			System.out.println(item);
		}
	}
}
