public class Aquatic extends Animal implements Carnivore<Food>{
    protected String habitat;

    // Parameterized constructor
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal); // Call to parent constructor
        this.habitat = habitat;
    }

    // Redefine toString()
    @Override
    public String toString() {
        return super.toString() + ", Habitat=" + habitat;
    }

    // swim method
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("This aquatic eat "+meat+".");
    }
}
