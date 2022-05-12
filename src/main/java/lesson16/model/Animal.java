package lesson16.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
public class Animal {
    private final String name;

    private final AnimalType type;

    private int age;

    private double hungry;

    private double money;

    private double clear;

    private double happy;

    private boolean ill;

    private final ArrayList<Present> presents;

    private int gameCount;

    private int workCount;

    public Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
        this.age = 1;
        this.hungry = 100;
        this.money = 150;
        this.clear = 100;
        this.happy = 50;
        this.ill = false;
        presents = new ArrayList<>();
        this.gameCount = 0;
        this.workCount = 0;
    }

    public void addHungry(double value) {
        hungry += countValue(value);
    }

    public void addClear(double value) {
        clear += countValue(value);
    }

    public void addHappy(double value) {
        happy += countValue(value);
    }

    public void increaseMoney(int min, int max) {
        money += (min + Math.random() * (max - min + 1));
    }

    public void addMoney(double value) {
        money += value;
    }

    public void increaseAge() {
        age++;
    }

    public void addPresent(Present present) {
        presents.add(present);
    }

    public void increaseGame() {
        gameCount++;
    }

    public void increaseWork() {
        workCount++;
    }

    public double countValue(double value) {
        double multiplier = 1;
        if (ill) {
            multiplier *= 2.0;
        }
        if (hungry < 50) {
            multiplier *= 1.5;
        }
        if (happy < 10) {
            multiplier *= 1.2;
        }
        return value * multiplier;
    }

    public void toSeek() {
        final int probability = 10 * (clear < 20 ? 3 : 1);
        if (probability > (Math.random() * 101)) {
            ill = true;
        }
    }

    public boolean cure() {
        if (money >= 50) {
            addMoney(-50);
            hungry = hungry > 70 ? 70 : hungry;
            clear = clear < 80 ? 80 : clear;
            happy = happy > 10 ? 10 : happy;
            ill = false;
            return true;
        }
        return false;
    }

    public void showState() {
        System.out.printf("Возраст: %d; Сытость: %.2f; Деньги: %.2f; Чистота: %.2f; Счастье: %.2f; Подарков: %d%n", age, hungry,
                money, clear, happy, presents.size());
        if (ill) {
            System.out.println("Животное заболело!");
        }
    }

}
