import java.util.ArrayList;

public class Hold {
	int maxWeight;
	ArrayList<Suitcase> suitcaseList;
	
	public Hold(int maxWeight) {
		this.maxWeight = maxWeight;
		this.suitcaseList = new ArrayList<>();
	}
	
	public void addSuitcase(Suitcase newSuitcase) {
		int currentWeight = 0;
		for (Suitcase suitcase: suitcaseList) {
			currentWeight += suitcase.totalWeight();
		}
		if (newSuitcase.totalWeight() +currentWeight <= this.maxWeight) {
			this.suitcaseList.add(newSuitcase);
		}
		
	}
	
	public String toString() {
		int totalWeight = 0;
		for (Suitcase suitcase:suitcaseList) {
			totalWeight += suitcase.totalWeight();
		}
		
		return suitcaseList.size() + "suitcases (" + totalWeight + "kg)";
	}
	
	public void printItems() {
			for (Suitcase suitcase: suitcaseList) {
					suitcase.printItems();
			}
	}
}
