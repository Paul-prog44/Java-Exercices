
public class ProductWarehouseWithHistory extends ProductWarehouse {
	ChangeHistory history;
	public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
		super(productName, capacity);
		super.addToWarehouse(initialBalance);
		history = new ChangeHistory();
		history.add(initialBalance);
	}
	
	public String history() {
		return this.history.toString();
	}
	
	public void addToWarehouse(double amount) {
		super.addToWarehouse(amount);
		this.history.add(this.getBalance());
	}
	
	public double takeFromWarehouse(double amount) {
		super.takeFromWarehouse(amount);	
		this.history.add(this.getBalance());
		return this.getBalance();		
	}
	
	public void printAnalysis() {
		System.out.println("Product: " + this.getName());
		System.out.println("History: " + this.history());
		System.out.println("Largest amount of product: " + this.history.maxValue());
		System.out.println("Smallest amount of product: " + this.history.minValue());
		System.out.println("Average: " + this.history.average());

	}
}
