public abstract class Animal {
    protected String animalType;

    public Animal(String animalType) {
        this.animalType = animalType;
    }

    public abstract void makeSound();
}
