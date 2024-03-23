
public class PaymentTerminal {
	private double money;
	private int affordableMeals;
	private int heartyMeals;
	
	public PaymentTerminal() {
		this.money = 1000.00;
	}
	
	public double eatAffordably(double payment) {
		if (payment >= 2.5) {
			this.money += 2.5;
			affordableMeals++;
			double change = payment - 2.5;
			return change;
		}
		return payment;
	}
	
	public double eatHeartily(double payment) {
		if (payment >= 4.3) {
			this.money += 4.3;
			heartyMeals++;
			double change = payment - 4.3;
			return change;
		}
		
		return payment;
	}
	
	public boolean eatAffordably(PaymentCard card) {
		if (card.balance() >= 2.5) {
			card.takeMoney(2.5);
			affordableMeals++;
			return true;
		} 
		return false;
	}
	
	public boolean eatHeartily(PaymentCard card) {
		if (card.balance() >= 4.3) {
			card.takeMoney(4.3);
			heartyMeals++;
			return true;
		}
		return false;
	}
	
	public void addMoneyToCard(PaymentCard card, double sum) {
		this.money+= sum;
		card.addMoney(sum);
	}
	
	public String toString() {
		return "Money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
	}
}
