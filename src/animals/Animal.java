package animals;

public class Animal {
    protected void eat() {
        System.out.println("Animal is eating");
    }

    protected void sleep() {
        System.out.println("Animal is sleeping");
    }

    protected void makeSound() {
        System.out.println("Animal is making sound");
    }
}

class Dog extends Animal {
     @Override
    public void makeSound() {
        System.out.println("Dog make wouf");
    }

    @Override
    protected void eat() {
        System.out.println("Dog is eating");
        System.out.println("--- Method from father class ---");
        super.eat();
    }

    @Override
    protected void sleep() {
        System.out.println("Dog is sleeping");
    }
}

class Cat extends Animal {
    @Override
    protected void makeSound() {
        System.out.println("Cat make meow");
    }
}

class TestAnimal {
    static void printSound(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {
        System.out.println("Test Inheritance");
        System.out.println("Father Class (Animal)");
        var animal1 = new Animal();
        animal1.eat();
        animal1.sleep();

        System.out.println("\nSon Class (Dog)");
        var dog1 = new Dog();
        dog1.eat();
        dog1.sleep();
        dog1.makeSound();

        System.out.println("\nSon Class (Cat)");
        var cat1 = new Cat();
        cat1.eat();
        cat1.sleep();
        cat1.makeSound();

        System.out.println("\nPolymorphism");
        printSound(animal1);
        printSound(dog1);
        printSound(cat1);
    }
}