public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;
    private Pet pet;
    
    public Person(String name, int height) {
    	this.name= name;
    	this.height = height;
    }

    public Person(String name) {
    	this.name=name;
    }

    
    public Person (String name, SimpleDate date) {
    	this.name = name;
    	this.birthday = date;
    }
    
    public Person (String name, int day, int month, int year) {
    	this.name = name;
    	this.birthday = new SimpleDate(day, month, year);
    }
    
    public Person(String name,SimpleDate date,int height, int weight) {
        this.name = name;
        this.birthday = date;
        this.weight = weight;
        this.height = height;
    }

    

   

    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    public String toString() {
        return this.name + "(" + this.getHeight() + " cm)";
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }
    
    public SimpleDate getBirthday() {
    	return this.birthday;
    }
    
    public boolean olderThan(Person compared) {
    	if (this.birthday.before(compared.getBirthday())) {
    		return true;
    	}
    	return false;
    }
    
    public boolean equals(Person compared) {
    	if (this == compared) {
    		return true;
    	}
    	
    	if (!(compared instanceof Person)) {
    		return false;
    	}
    	
    	Person comparedPerson = (Person) compared;
    	
    	if (this.name.equals(comparedPerson.name) &&
    		this.height == comparedPerson.height &&
    		this.weight == comparedPerson.weight &&
    		this.birthday.equals(comparedPerson.birthday)
    		) {
    		return true;
    	}
    	
    	return false;
    }
   
}