public class Chicken extends Animal implements Edible {
    public Chicken() {
        super("Chicken");
    }

    @Override
    public void makeSound() {
        System.out.println(animalType + "'s sound is bark!");
    }

    @Override
    public String howToEat() {
        return "You can boil, also can make BBQ.";
    }
}
