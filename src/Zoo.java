public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25; // Instruction 14: nbrCages is now a constant
    private int animalCount = 0; // Animal counter

    // Constructor
    public Zoo(String name, String city) {
        this.animals = new Animal[nbrCages]; // Zoo can contain max 25 animals
        this.name = name;
        this.city = city;
    }

    // Instruction 10: Add animal method with condition to prevent overfilling the zoo
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) { // Check if zoo is full
            System.out.println("Cannot add animal: Zoo is full.");
            return false;
        }
        if (searchAnimal(animal) != -1) { // Check if animal already exists in the zoo
            System.out.println("Animal already exists in the zoo.");
            return false;
        }
        animals[animalCount++] = animal; // Add animal to zoo
        return true;
    }

    // Instruction 11: Method to display all animals in the zoo
    public void displayAnimals() {
        System.out.println("Animals in " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    // Instruction 11: Search for an animal by name
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Instruction 12: Ensure no duplicate animals and prevent exceeding max capacity
    // Method already implemented in addAnimal()

    // Instruction 13: Remove an animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("Animal not found in the zoo.");
            return false;
        }
        // Shift animals to fill the removed animal's position
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[--animalCount] = null; // Clear the last position
        return true;
    }

    // Instruction 15: Check if zoo is full
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // Instruction 16: Compare two zoos and return the one with more animals
    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        return z1.animalCount > z2.animalCount ? z1 : z2;
    }

    // Method to display zoo information
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Number of Animals: " + animalCount);
    }

    // Override toString method for proper display
    @Override
    public String toString() {
        return "Zoo [Name=" + name + ", City=" + city + ", Number of Cages=" + nbrCages + ", Number of Animals=" + animalCount + "]";
    }
}
