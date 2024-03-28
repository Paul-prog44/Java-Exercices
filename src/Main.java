import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		
		 LicensePlate li1 = new LicensePlate("FI", "ABC-123");
	     LicensePlate li2 = new LicensePlate("FI", "UXE-465");
	     LicensePlate li3 = new LicensePlate("D", "B WEQ-431");
	     LicensePlate li4 = new LicensePlate("FR", "B WQ-43541");
	     LicensePlate li5 = new LicensePlate("DE", "B WP-43781");

	     VehicleRegistry registry = new VehicleRegistry();
	     registry.add(li1, "Paul");
	     registry.add(li2, "Bernard");
	     registry.add(li3, "Chantal");
	     registry.add(li4, "Anne-Sophie");
	     registry.add(li5, "Julie");
	     

	       
		 registry.printLicensePlates();
		 registry.printOwners();
		 System.out.println("------------");
	     LicensePlate li6 = new LicensePlate("FR", "B WQ-43541");
	     registry.add(li6, "Noemie");
		 registry.printOwners();

	}
}
