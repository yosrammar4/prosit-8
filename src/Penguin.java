public class Penguin extends Aquatic {
    private float swimmingDepth;

    // Parameterized constructor
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat); // Call to Aquatic constructor
        this.swimmingDepth = swimmingDepth;
    }

    // Redefine toString()
    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth=" + swimmingDepth;
    }

    // swim method
    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
