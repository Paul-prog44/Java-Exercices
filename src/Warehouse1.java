import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse1 {
	Map<String, Integer> products = new HashMap<>();
	Map<String, Integer> productStocks = new HashMap<>();
	
	public void addProduct(String product, int price, int stock) {
		this.products.put(product, price);
		this.productStocks.put(product, stock);
	}
	
	public int price(String product) {
		if (this.products.containsKey(product)) {
			return this.products.get(product);

		}
		return -99;
	}
	
	public int stock(String product) {
		if (this.productStocks.containsKey(product)) {
			return this.productStocks.get(product);
		}
		return 0;
	}
	
	public boolean take(String product) {
		if (this.productStocks.containsKey(product) && this.productStocks.get(product) >= 1) {
			this.productStocks.put(product, this.productStocks.get(product)-1);
			return true;
		}
		return false;
	}
	
	public Set<String> products() {
		return products.keySet();
	}
}
