import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
	ArrayList<Double> status;
	
	public ChangeHistory() {
		this.status = new ArrayList<>();
	}
	
	public void add(double status) {
		this.status.add(status);
	}
	
	public void clear() {
		this.status.clear();
	}
	
	public String toString() {
		return this.status.toString();
	}
	
	public double maxValue() {
		if (this.status.isEmpty()) {
			return 0;
		}
		
		return (Collections.max(this.status));
	}
	
	public double minValue() {
		if (this.status.isEmpty()) {
			return 0;
		}
		
		return (Collections.min(this.status));
	}
	
	public double average() {
		if (this.status.isEmpty()) {
			return 0;
		}
		double sum=0;
		for (double value:status) {
			sum += value;
		}
		double average = (double) sum / this.status.size();
		return average;
	}
}
