package lesson16.user;

import java.util.Scanner;

public class UserInputServices {
    private static final Scanner SCANNER = new Scanner(System.in);

    public int getNumberFromUser() {
        return SCANNER.nextInt();
    }

    public String getStringFromUser() {
        return SCANNER.next();
    }
}
