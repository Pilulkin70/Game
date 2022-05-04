package lesson16.action;

import lesson16.model.Animal;

public enum ActionType {
    FOOD("Кормить", new Food()),
    GAME("Играть", new Game()),
    WORK("Работать", new Work()),
    EXIT("Выход", new Exit());

    private final String name;
    private final Action action;
    ActionType(String name, Action action) {
        this.name = name;
        this.action = action;
    }

    public void doAction(Animal animal) {
        action.doAction(animal);
    }

    @Override
    public String toString() {
        return name;
    }
}
