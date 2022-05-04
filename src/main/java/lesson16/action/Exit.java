package lesson16.action;

import lesson16.model.Animal;

public class Exit implements Action {
    @Override
    public void doAction(Animal animal) {
        System.out.println("Все буде Java!");
        System.exit(0);
    }
}
