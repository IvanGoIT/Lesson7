package animals;

public class Cat extends Animal {

    public Cat(int age, int weight) {
        super("Kitty", age, weight);
        System.out.println("Объект кота создан");
    }
}
