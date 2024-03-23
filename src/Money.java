
public class Money {
	private final int euros;
	private final int cents;
	
	public Money(int euros, int cents) {
		this.euros = euros;
		this.cents = cents;
	}
	
	public int euros() {
		return euros;
	}
	
	public int cents() {
		return cents;
	}
	
	public String toString() {
		String zero = "";
		if (cents <= 10) {
			zero = "0";
		}
		return euros + "." + zero + cents + "e";
	}
	
	public Money plus(Money addition) {
		int newEuros = this.euros +addition.euros;
		int newCents = this.cents + addition.cents;
		Money newMoney = new Money(newEuros, newCents);
				
		return newMoney;
	}
	
	public boolean lessThan(Money compared) {
		if (this.euros < compared.euros) {
			return true;
		}
		return false;
	}
	
	public Money minus(Money decreaser) {
		if (this.euros > decreaser.euros) {
			if ((this.cents >= decreaser.cents)) {
				return new Money((this.euros-decreaser.euros), (this.cents-decreaser.cents));
			} else {
				return new Money((this.euros-decreaser.euros -1), (100-this.cents-decreaser.cents));
			}
			
		} else 
			return new Money(0, 0);
	}
}
