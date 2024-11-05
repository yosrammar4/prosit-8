public class ZooManagement {
    public static void main(String[] args) {
        // Create instances of Aquatic, Dolphin, and Penguin using parameterized constructors
        Aquatic shark = new Aquatic("Fish", "Shark", 5, false, "Ocean");
        Dolphin dolphin = new Dolphin("Mammal", "Dolphin", 12, true, "Sea", 25.0f);
        Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Antarctica", 100.0f);
        Terrestrial lion = new Terrestrial("Mammal", "Lion", 8, true, 4);

        // Display the objects
        System.out.println(shark);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Call the swim method for each object
        shark.swim();      // Output: This aquatic animal is swimming.
        penguin.swim();    // Output: This penguin is swimming.
        lion.walk();

        // Test eating methods
        shark.eatMeat(Food.MEAT);
        lion.eatMeatAndPlant(Food.BOTH);
        penguin.eatMeat(Food.MEAT);
    }
}
