
public class LiteracyStatisticCountry {
	private String theme;
	private String ageGroup;
	private String gender;
	private String country;
	private int year;
	private double literacyPercent;
	
	public LiteracyStatisticCountry(String theme, String ageGroup,
			String gender, String country, int year, double literacyPercent) {
		this.theme = theme;
		this.ageGroup = ageGroup;
		this.gender = gender;
		this.country = country;
		this.year = year;
		this.literacyPercent = literacyPercent;
	}
	public double getLiteracyPercent() {
		return literacyPercent;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getYear() {
		return year;
	}
	public String getGender() {
		return gender;
	}
}
