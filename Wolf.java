public class Wolf extends Animal implements Canine, Legs {
    @Override
    public void eat() {
        System.out.println("Wolf is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Wolf is sleeping.");
    }

    @Override
    public void bark() {
        System.out.println("Wolf is barking.");
    }

    @Override
    public int numberOfLegs() {
        return 4; // Wolf has 4 legs
    }
}
