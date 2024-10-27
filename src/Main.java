public class Main {

    /*The Animal abstract class defines common behaviors (eat() and sleep()).
    The Legs interface ensures that all animals implementing it will define the number of legs.
    Canine and Feline interfaces define specific behaviors like bark() for Canine animals and meouw() for Feline animals.
    In the Main class, we create objects for Wolf, Dog, and Lion, make them perform actions like eating, sleeping, barking (for canine animals), 
    and meowing (for feline animals), and ensure they all have the correct number of legs. */
    
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
