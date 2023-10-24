public class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public void makeSound() {
        System.out.println(animalType + "'s sound is bark!");
    }
}
