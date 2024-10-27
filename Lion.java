public class Lion extends Animal implements Feline, Legs {
    @Override
    public void eat() {
        System.out.println("Lion is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping.");
    }

    @Override
    public void meouw() {
        System.out.println("Lion is meowing.");
    }

    @Override
    public int numberOfLegs() {
        return 4; // Lion has 4 legs
    }
}
