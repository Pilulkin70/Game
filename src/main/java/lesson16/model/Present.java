package lesson16.model;

import lombok.Getter;

import java.util.Random;

@Getter
public class Present {
    final private static Random random = new Random();
    private final String name;
    private final int cost;

    public Present(int cost) {
        this.name = "Present " + random.nextInt();
        this.cost = cost;
    }
}
