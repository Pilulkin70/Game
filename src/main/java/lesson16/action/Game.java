package lesson16.action;

import lesson16.model.Animal;

public class Game implements Action {
    @Override
    public void doAction(Animal animal) {
        animal.addHungry(-5);
        animal.incriseAge();
        System.out.println("Живтное поиграло. Сытость -5, Возраст +1");
        System.out.printf("Сытость: %f, Возраст: %d%n", animal.getHungry(), animal.getAge());
    }
}
