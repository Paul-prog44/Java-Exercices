
public enum Suit {
	DIAMOND("Diamond"), 
	SPADE("Spade"), 
	CLUB("Club"), 
	HEART("Heart");
	
	private String type;
	
	private Suit(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
