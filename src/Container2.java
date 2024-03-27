
public class Container2 {
	private int liquid;
	
	public Container2() {
		this.liquid = 0;
	}
	
	public void add(int amount) {
		this.liquid += amount;
	}
	
	public void remove(int amount) {
		this.liquid -= amount;
	}
	
	public int getLiquid() {
		return this.liquid;
	}
	
	public void setLiquid(int amount) {
		this.liquid= amount;
	}
	
	public String toString() {
		return this.liquid + "/100";
	}
}
