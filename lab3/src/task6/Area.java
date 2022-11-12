package task6;

import task2.Baravelli;
import task2.ChocAmor;
import task2.Lindt;
import task4.CandyBag;

public class Area {
    // TODO[0]: Add fields
    private CandyBag candies;
    private int number;
    private String street;
    private String message;

    // TODO[1]: Constructor without parameters
    public Area() {
        candies = new CandyBag();
        number = 0;
        street = "nowhere";
        message = "nowhere";
    }

    // TODO[2]: Constructor which initialize all the fields
    public Area(int number, String street, String message, CandyBag candies) {
        this.number = number;
        this.street = street;
        this.candies = candies;
        this.message = message;
    }

    // TODO[3]: Add getBirthdayCard() method with instanceof
    public void getBirthdayCard() {
        System.out.println("Street " + street + ", number " + number + "\n");
        System.out.println(message + "\n");

        for (int i = 0; i < candies.getCandies().size(); i++) {
            if (candies.getCandies().get(i) instanceof Lindt) {
                candies.getCandies().get(i).printLindtDim();
            } else if (candies.getCandies().get(i) instanceof Baravelli) {
                candies.getCandies().get(i).printBaravelliDim();
            } else if (candies.getCandies().get(i) instanceof ChocAmor) {
                candies.getCandies().get(i).printChocAmorDim();
            }
        }
    }

    // TODO[4]: Add getBirthdayCardv2() method without instanceof
    public void getBirthdayCardv2() {
        System.out.println("Street " + street + ", number " + number + "\n");
        System.out.println(message + "\n");

        for (int i = 0; i < candies.getCandies().size(); i++) {
            candies.getCandies().get(i).printDim();
        }
    }

    // TODO[0]: Add getters and setters

    public CandyBag getCandies() {
        return candies;
    }

    public void setCandies(CandyBag candies) {
        this.candies = candies;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
