package animals;

public class Animal {
    public String name = "default";
    private int age = 5;
    protected int weight = 10;

    // public доступ есть везде
    // private доступ имеет только этот класс

    // protected доступ есть у этого класса и у классов - детей

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void showAge() {
        System.out.println(age);
    }

    public void showWeight() {
        showWeight("");
    }

    public void showWeight(String message) {
        System.out.println(message + weight);
    }
}
