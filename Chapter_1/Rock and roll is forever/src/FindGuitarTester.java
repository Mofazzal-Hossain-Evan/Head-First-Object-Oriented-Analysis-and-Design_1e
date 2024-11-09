import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        // Create inventory and initialize it
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        // Create a search query with the desired specifications
        Guitar whatErinLikes = new Guitar("", 0, "Fender", "Stratocastor",
                "electric", "Alder", "Alder");

        // Search for matching guitars - make sure `search()` returns a List<Guitar>
        List<Guitar> matchingGuitars = (List<Guitar>) inventory.search(whatErinLikes); // This should be a List<Guitar>

        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like this guitar: ");
            for (Guitar guitar : matchingGuitars) {
                System.out.println(" We have a Builder: " + guitar.getBuilder() + " " +
                        "Model: " + guitar.getModel() + " " +
                        "Type: " + guitar.getType() + " " +
                        "Back Wood: " + guitar.getBackWood() + " " +
                        "Top Wood: " + guitar.getTopWood() + " " +
                        "Price: $" + guitar.getPrice());
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }


        private static void initializeInventory(Inventory inventory) {
        // Add sample guitars
        inventory.addGuitar("11277", 3999.95, "Fender", "Stratocastor",
                "electric", "Alder", "Alder");
        inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor",
                "electric", "Maple", "Maple");
        inventory.addGuitar("V9512", 1549.95, "Gibson", "Les Paul",
                "electric", "Mahogany", "Maple");
        // Add more guitars as needed
    }
}
