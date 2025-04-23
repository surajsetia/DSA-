// Abstract class
abstract class Animal {
    // Constructor
    Animal() {
        System.out.println("An animal is created.");
    }

    // Abstract method
    abstract void makeSound();
    abstract void eat();
}

// Concrete class Lion
class Lion extends Animal {
    @Override
    void makeSound() {
        System.out.println("Lion roars!");
    }

    @Override
    void eat() {
        System.out.println("Lion eats meat.");
    }
}

// Concrete class Elephant
class Elephant extends Animal {
    @Override
    void makeSound() {
        System.out.println("Elephant trumpets!");
    }

    @Override
    void eat() {
        System.out.println("Elephant eats grass and fruits.");
    }
}

// Main class
public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.makeSound();
        lion.eat();

        System.out.println();

        Animal elephant = new Elephant();
        elephant.makeSound();
        elephant.eat();
    }
}
