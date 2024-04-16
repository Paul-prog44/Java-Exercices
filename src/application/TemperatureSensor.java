package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
	int value;
	boolean state = false;
	
	public TemperatureSensor() {
	}
	
	public boolean isOn() {
		return this.state;
	}
	
	public void setOn() {
		this.state = true;
	}
	
	public void setOff() {
		this.state = false;
	}
	
	public int read() {
		if (state == false) {
			throw new IllegalStateException();
		}
		this.value = new Random().nextInt(61)-30;
		return this.value;
	}
	
}
