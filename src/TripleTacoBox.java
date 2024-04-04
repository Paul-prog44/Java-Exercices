
public class TripleTacoBox implements TacoBox{
	int tacos = 0;
	public TripleTacoBox() {
		this.tacos = 3;
	}
	
	public int tacosRemaining() {
		return this.tacos;
	}
	
	public void eat() {
		if (this.tacos >=1) {
			this.tacos--;
		}
	}
}
