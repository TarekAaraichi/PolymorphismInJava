public class Main {
    public static void main(String[] args) {
        // Create instances of Wolf, Dog, and Lion
        Wolf wolf = new Wolf();
        Dog dog = new Dog();
        Lion lion = new Lion();

        // Wolf actions
        System.out.println("Wolf:");
        wolf.eat();
        wolf.sleep();
        wolf.bark();
        System.out.println("Number of legs: " + wolf.numberOfLegs());

        // Dog actions
        System.out.println("\nDog:");
        dog.eat();
        dog.sleep();
        dog.bark();
        System.out.println("Number of legs: " + dog.numberOfLegs());

        // Lion actions
        System.out.println("\nLion:");
        lion.eat();
        lion.sleep();
        lion.meouw();
        System.out.println("Number of legs: " + lion.numberOfLegs());
    }
}
