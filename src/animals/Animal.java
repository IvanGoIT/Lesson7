package animals;

public class Animal {
    public String name;
    private int age;
    protected int weight;

    // public доступ есть везде
    // private доступ имеет только этот класс

    // protected доступ есть у этого класса и у классов - детей

    public void showAge() {
        System.out.println(age);
    }

    public void showWeight() {
        System.out.println(weight);
    }
}
