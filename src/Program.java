import animals.Animal;
import animals.Cat;
import animals.Dog;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat(10, 13);
        Cat cat2 = new Cat(5, 1);
        Cat cat3 = new Cat(3, 3);
        Dog dog1 = new Dog("Doggy", 3, 5);
        Dog dog2 = new Dog("Doggy 2", 3, 5);
        Dog dog3 = new Dog("Doggy 3", 3, 5);

        // cat1.weight = 10; // нельзя

        // cat1.age = 3; // нельзя
        // cat1.name = "Kitty";

        // dog1.age = 5; // нельзя

        cat1.showWeight();
        dog1.showWeight();

        cat1.run();

        // Animal animal = new Animal("SomeAnimal", 10, 10);
    }
}
