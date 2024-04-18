package typeParameters;

import java.util.ArrayList;

public class Pipe<T> {
	ArrayList<T> pipe = new ArrayList<>();
	
	private T element;
	
	public Pipe() {}
	
	public void putIntoPipe(T value) {
		pipe.add(value);
	}
	
	public T takeFromPipe() {
		if (pipe.isEmpty()) {
			return null;
		} else {
			return pipe.remove(0);
		}
	}
	
	public boolean isInPipe() {
		if (pipe.isEmpty()) {
			return false;
		} 
		return true;
	}
}
