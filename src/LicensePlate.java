
public class LicensePlate {
	private final String liNumber;
	private final String country;
	
	public LicensePlate(String liNumber, String country) {
		this.liNumber = liNumber;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return country + " " + liNumber;
	}
	
	@Override
	public boolean equals(Object comparedLicensePlate) {
		if (this == comparedLicensePlate) {
			return true;
		}
		
		if (!(comparedLicensePlate instanceof LicensePlate)) {
			return false;
		}
		
		LicensePlate newLicensePlate = (LicensePlate) comparedLicensePlate;
		if (this.liNumber.equals(newLicensePlate.liNumber) &&
			this.country.equals(newLicensePlate.country)) {
			return true;
		}
		
		return false;	
	}
	
	public int hashCode() {
		return this.liNumber.hashCode() + this.country.hashCode();
	}
}
