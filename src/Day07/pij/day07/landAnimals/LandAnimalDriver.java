package pij.day07.landAnimals;

public class LandAnimalDriver {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breathe(80);
        System.out.println(dog.makeSound()); // Woof

        Cat cat = new Cat();
        cat.breathe(70);
        System.out.println(cat.makeSound()); // Meeouw

        LandAnimal animal1 = new Dog();
        animal1.breathe(85);
        System.out.println(animal1.makeSound()); // Woof

        LandAnimal animal2 = new Cat();
        animal2.breathe(75);
        System.out.println(animal2.makeSound()); // Meeouw
    }
}
