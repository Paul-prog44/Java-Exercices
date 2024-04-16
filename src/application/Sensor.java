package application;

public interface Sensor {
	boolean isOn();	//true if sensor is on
	void setOn();	//set sensor on
	void setOff();	//set sensor off
	int read();	//return sensor value if on, otherwise throws IllegalStateException
}
