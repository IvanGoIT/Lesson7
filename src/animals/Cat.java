package animals;

import animals.interf.IDrink;

public class Cat extends AnimalFourLegs {

    public Cat(int age, int weight) {
        super("Kitty", age, weight);
        System.out.println("Объект кота создан");
    }

    @Override
    public void drink() {
        System.out.println("котик пьет");
    }

    @Override
    public void wc() {
        System.out.println("котик ходит в туалет");
    }
}
