public class Terrestrial extends Animal implements Omnivore<Food>{
    int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public void walk() {
        System.out.println(name + " is walking on " + nbrLegs + " legs.");
    }

    @Override
    public void eatMeatAndPlant(Food food){
        System.out.println("This terrestrial eat "+food+".");
    }
}