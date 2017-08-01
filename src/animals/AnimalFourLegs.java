package animals;

public abstract class AnimalFourLegs extends Animal {
    public AnimalFourLegs(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void run() {
        System.out.println("бег на 4 лапах");
    }
}
