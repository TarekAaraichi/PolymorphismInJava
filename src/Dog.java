public class Dog extends Animal implements Canine, Legs {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void bark() {
        System.out.println("Dog is barking.");
    }

    @Override
    public int numberOfLegs() {
        return 4; // Dog has 4 legs
    }
}
