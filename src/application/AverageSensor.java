package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
	ArrayList<Sensor> sensors = new ArrayList<>();
	boolean state = false;
	
	public boolean isOn() {
		return this.state;
	}
	
	public void setOn() {
		sensors.stream().forEach(sensor -> sensor.setOn());
		this.state = true;
	}
	
	public void setOff() {
		sensors.stream().forEach(sensor -> sensor.setOff());
		this.state = false;
	}
	
	public int read() {
		if(this.state == false || sensors.isEmpty()) {
			throw new IllegalStateException();
		}
		int sum = 0;
		for (Sensor sensor : sensors) {
	        sum += sensor.read();
	    }
	    return sum / sensors.size();
	}
	
	public void addSensor(Sensor sensor) {
		this.sensors.add(sensor);
	}
	
	public List<Integer> readings() {
		List<Integer> temperatureList = new ArrayList<>();
		
		for (Sensor sensor : sensors) {
			temperatureList.add(sensor.read());
	    }
		return temperatureList;
		
	}

}
