package application;

public class StandardSensor implements Sensor {
	int value;
	
	public StandardSensor(int initialValue) {
		this.value = initialValue;
	}
	
	public boolean isOn() {
		return true;
	}
	
	public void setOn() {}
	
	public void setOff() {}
	
	public int read() {
		if (this.isOn() == false) {
			throw new IllegalStateException();
		}
		return this.value;
	}
	
	
}
