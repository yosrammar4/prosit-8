public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    // Parameterized constructor
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat); // Call to Aquatic constructor
        this.swimmingSpeed = swimmingSpeed;
    }

    // Redefine toString()
    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed=" + swimmingSpeed;
    }

    // swim method
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
