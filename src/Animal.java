public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    // Constructor
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Getters and Setters
    public String getFamily() { return family; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isMammal() { return isMammal; }

    public void setFamily(String family) { this.family = family; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setMammal(boolean isMammal) { this.isMammal = isMammal; }

    // Override toString method
    @Override
    public String toString() {
        return "Animal [Family=" + family + ", Name=" + name + ", Age=" + age + ", Is Mammal=" + isMammal + "]";
    }
}
