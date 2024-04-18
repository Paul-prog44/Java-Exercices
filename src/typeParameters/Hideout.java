package typeParameters;

public class Hideout<T> {
	private T first;
	
	public Hideout() {}
	
	public void putIntoHideout(T toHide) {
		this.first = toHide;
	}
	
	public T takeFromHideout() {
		T transitory = this.first;
		this.first = null;
		return transitory;
	}
	
	public boolean isInHideout() {
		if (this.first == null) {
			return false;
		} 
		return true;
	}
}
