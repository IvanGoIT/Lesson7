package animals;

public class Dog extends Animal {

    public Dog(String name, int age, int weight) {
        super(name, age, weight);
        System.out.println("Объект собаки (" + name + ") создан ");
    }

    // переопределение метода, то есть изменяем функционал метода
    @Override
    public void showWeight() {
        System.out.print("Вес собаки = ");
        super.showWeight();
    }
}
