import java.util.HashMap;

public class VehicleRegistry {
	HashMap<LicensePlate, String> registry = new HashMap<>();
	
	public boolean add(LicensePlate licensePlate, String owner) {
		if (registry.containsKey(licensePlate)) {
			return false;
		}
		registry.put(licensePlate, owner);
		return true;
	}
	
	public String get(LicensePlate licensePlate) {
		return registry.get(licensePlate);
	}
	
	public boolean remove(LicensePlate licensePlate) {
		if (registry.containsKey(licensePlate)) {
			registry.remove(licensePlate);
			return true;
		}
		return false;
	}
	
	public void printLicensePlates() {
		for (LicensePlate plate:registry.keySet()) {
			System.out.println(plate);
		}
	}
	public void printOwners() {
		for (String owner:registry.values()) {
			System.out.println(owner);
		}
	}
}
