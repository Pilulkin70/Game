package lesson16.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Animal {
    private final String name;

    private final AnimalType type;

    private int age;

    private double hungry;

    private double clear;

    public Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
        this.age = 1;
        this.hungry = 100;
        this.clear = 100;
    }

    public void addHungry(double value) {
        hungry += value;
    }

    public void addClear(double value) {
        clear += value;
    }

    public void incriseAge() {
        age++;
    }
}
