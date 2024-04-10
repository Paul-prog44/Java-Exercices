import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LitteracyRateReader {
	List<String> rows = new ArrayList<>();
	ArrayList<LiteracyStatisticCountry> countries = new ArrayList()
;	
	public void readFile() {
		try {
			Files.lines(Paths.get("literacy.csv")).forEach(row -> rows.add(row));
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		for(String row:rows) {
			String[] parts = row.split(",");
			LiteracyStatisticCountry lts = new LiteracyStatisticCountry(parts[0], parts[1], parts[2], parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5]));
			countries.add(lts);
		}
		countries.stream().sorted((p1, p2) -> {
			return (int) (p1.getLiteracyPercent() - (int)p2.getLiteracyPercent());
		}).forEach(p -> System.out.println(p.getCountry() + " (" +
			p.getYear() + "), " + p.getGender().trim() + ", " + p.getLiteracyPercent()));
	}
	
	
}

