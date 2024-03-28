
public class SimpleDate {
	private int day;
	private int month;
	private int year;
	
	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}
	
	public boolean before(SimpleDate compared) {
		if (this.year < compared.year) {
			return true;
		}
		
		if (this.year > compared.year) {
			return false;
		}
		
		if (this.month < compared.month) {
			return true;
		}
		
		if (this.month > compared.month) {
			return false;
		}
		
		if (this.day < compared.day) {
			return true;
		}
		
		return false;
	}
	
	public boolean equals (SimpleDate compared) {
		if (this == compared) {
			return true;
		} 
		
		if (!(compared instanceof SimpleDate)) {
			return false;
		}
		
		SimpleDate comparedDate = (SimpleDate) compared;
		
		if (this.day == comparedDate.day &&
			this.month == comparedDate.month &&
			this.year == comparedDate.year) {
			return true;
		}
		
		return false;
		
	}
	
	public void advance() {
		if (this.day < 30 ) {
			day++;
		} else {
			this.day = 0;
			if (month <12) {
				month++;
			} else {
				this.month = 0;
				year++;
			}
		}
	}
	
	public void advance(int howManyDays) {
		if (this.day+howManyDays <= 30 ) {
			day+=howManyDays;
		} else {
			this.day = this.day+howManyDays-30;
			if (month <12) {
				month++;
			} else {
				this.month = 0;
				year++;
			}
		}
	}
	
	public SimpleDate afterNumberOfDays(int days) {
		SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
		newDate.advance(days);
		
		return newDate;
		
	}
	
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		
		if (!(object instanceof SimpleDate)) {
			return false;
		}
		
		SimpleDate comparedObject = (SimpleDate) object;
		if (this.day == comparedObject.day &&
			this.month == comparedObject.month &&
			this.year == comparedObject.year) {
			return true;
		}
		
		return false;
	}
	
	public int hashCode() {
		return this.day + this.month +this.year;
	}
	
}
