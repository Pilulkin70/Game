package lesson16.action;

import lesson16.model.Animal;

public class Work implements Action {
    @Override
    public void doAction(Animal animal) {
        if (animal.getAge() < 5) {
            return;
        }
        System.out.println("Животное работает :)");
    }
}
