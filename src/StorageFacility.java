import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
	private HashMap<String, ArrayList<String>> storageFacility = new HashMap<>();
	
	public void add(String unit, String item) {
		this.storageFacility.putIfAbsent(unit, new ArrayList<>());

		this.storageFacility .get(unit).add(item);
	}
	
	public ArrayList<String> contents(String unit) {
		return this.storageFacility.get(unit);
	}
	
	public void remove (String unit, String item) {
		ArrayList<String> itemsInUnit = this.storageFacility.get(unit);
		this.storageFacility.get(unit).remove(item);
		
		if (itemsInUnit.isEmpty()) {
			storageFacility.remove(unit);
		}
	}
	
	public ArrayList<String> storageUnits() {
		ArrayList<String> storageUnitsNotEmpty = new ArrayList<>();
		
		for (String unit:this.storageFacility.keySet()) {
			if(!(this.storageFacility.get(unit).isEmpty())) {
				storageUnitsNotEmpty.add(unit);
			}
		}
		
		return storageUnitsNotEmpty;
	}
}
