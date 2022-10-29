package task6;

import task4.CandyBag;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String street = scanner.next();
        String message = scanner.next();

        // TODO: Uncomment the code after implementing the task.

        Area area = new Area(number, street, message, new CandyBag());

        System.out.println("With instanceof:");
        area.getBirthdayCard();
        System.out.println();
        System.out.println("Without instanceof:");
        area.getBirthdayCardv2();
    }
}
