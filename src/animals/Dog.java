package animals;

public class Dog extends AnimalFourLegs {

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

    @Override
    public void drink() {
        System.out.println("песик пьет");
    }

    @Override
    public void wc() {
        System.out.println("песик ходит в туалет");
    }
}
