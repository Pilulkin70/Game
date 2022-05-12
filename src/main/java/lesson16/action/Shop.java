package lesson16.action;

import lesson16.model.Animal;
import lesson16.model.Present;

import static lesson16.Main.INPUT_SERVICES;

public class Shop implements Action {
    @Override
    public void doAction(Animal animal) {
        double money = animal.getMoney();
        if (money < 100) {
            System.out.println("Не хватает денег на покупки.");
            return;
        }
        int number;
        int lastMenuNumber;
        do {
            System.out.println("Выберите подарок: ");
            for (int i = 0; i <= (money - 100) / 50; i++) {
                System.out.printf("%d) за %d%n", i, (100 + 50 * i));
            }
            lastMenuNumber = (int) (money - 100) / 50 + 1;
            System.out.printf("%d) Завершить покупки%n", lastMenuNumber);
            number = INPUT_SERVICES.getNumberFromUser();
        } while (number < 0 || number > lastMenuNumber);
        if (number == lastMenuNumber) {
            System.out.println("Жаль, что Вам ничего не подошло...");
        } else {
            animal.addMoney(-100 - 50 * number);
            animal.addPresent(new Present(100 + 50 * number));
            animal.addHappy(20 + 5 * number);
            System.out.println(animal.getName() + " скупилось)");
            animal.showState();
        }
    }
}
