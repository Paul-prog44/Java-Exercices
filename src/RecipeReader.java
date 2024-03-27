import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeReader {
    public static ArrayList<Recipe> readRecipesFromFile(String filePath) {
    	ArrayList<Recipe> recipes = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(filePath));

            while (scanner.hasNextLine()) {
                String recipeName = scanner.nextLine();
                int cookingTime = Integer.parseInt(scanner.nextLine());

                ArrayList<String> ingredients = new ArrayList<>();
                String line;
                while (scanner.hasNextLine() && !(line = scanner.nextLine()).isEmpty()) {
                    ingredients.add(line);
                }

                recipes.add(new Recipe(recipeName, cookingTime, ingredients));
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle file not found exception
        }

        return recipes;
    }
}