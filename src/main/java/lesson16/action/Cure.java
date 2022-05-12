package lesson16.action;

import lesson16.model.Animal;

public class Cure implements Action {
    @Override
    public void doAction(Animal animal) {
        if (!animal.isIll()) {
            System.out.println("Животное не болеет. Пожалуй лечить не будем - пусть поживет!");
            return;
        }
        if (!animal.cure()) {
            System.out.println("На лечение не хватает тугриков.");
        } else {
            System.out.println(animal.getName() + " вылечено.");
            animal.showState();
        }

    }
}
