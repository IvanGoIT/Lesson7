package animals;

public abstract class AnimalSnake extends Animal {

    public AnimalSnake(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void run() {
        System.out.println("ползает по земле");
    }
}
