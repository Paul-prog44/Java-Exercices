
public class Counter {
	int value;
	
	public Counter() {
		this(0);
	}
	
	public Counter(int startValue) {
		this.value = startValue;
	}
	
	public int value() {
		return value;
	}
	
	public void increase() {
		this.increase(1);
	}
	
	public void decrease() {
		this.decrease(1);
	}
	
	public void increase(int increaseBy) {
		this.value += increaseBy;
	}
	
	public void decrease(int decreaseBy) {
		this.value -= decreaseBy;
	}
	
	public String toString() {
		return "Valeur actuelle : " + this.value;
	}
}
