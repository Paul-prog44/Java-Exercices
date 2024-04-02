
public class Warehouse {
	private double capacity;
	private double balance;
	
	public Warehouse(double capacity) {
		this.capacity = capacity;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getCapacity() {
		return this.capacity;
	}
	
	public double howMuchSpaceLeft() {
		return this.capacity - this.balance;
	}
	
	public void addToWarehouse(double amount) {
		if (amount > 0) {
			if (this.balance + amount <= this.capacity) {
				this.balance += amount;
			}
			
			if (this.balance + amount > this.capacity) {
				this.balance = this.capacity;
			}
		}
	}
	
	public double takeFromWarehouse(double amount) {
		if (amount > 0) {
			if (amount > this.balance) {
				double amountToReturn = this.balance; 
				this.balance = 0;
				return amountToReturn;
			}
			if (amount < this.balance) {
				this.balance -= amount;
				return amount;
			}
		} 
		return 0;
	}
	
	public String toString() {
		return "balance =" + this.balance + ", space left " + this.howMuchSpaceLeft();
	}
}
