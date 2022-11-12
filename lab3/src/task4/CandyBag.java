package task4;

import task1.CandyBox;
import task2.Lindt;
import task2.Baravelli;
import task2.ChocAmor;

import java.util.ArrayList;

public class CandyBag {
    // Add ArrayList as field "candies"
    private ArrayList<CandyBox> candies = new ArrayList<>();

    // Constructor which populates the array list (the default gift)
    public CandyBag() {
        Lindt firstBoxLindt = new Lindt( "cherry", "Austria", 20F, 5.4F, 19.2F);
        Lindt secondBoxLindt = new Lindt("apricot", "Austria", 20F, 5.4F, 19.2F);
        Lindt thirdBoxLindt = new Lindt("strawberry", "Austria", 20F, 5.4F, 19.2F);

        Baravelli fourthBoxBaravelli = new Baravelli("grape", "Italy", 6.7F, 8.7F);

        ChocAmor fifthBoxChoc = new ChocAmor("coffee", "France",5.5F);
        ChocAmor sixthBoxChoc = new ChocAmor("vanilla","France", 5.5F);

        candies.add(firstBoxLindt);
        candies.add(secondBoxLindt);
        candies.add(thirdBoxLindt);
        candies.add(fourthBoxBaravelli);
        candies.add(fifthBoxChoc);
        candies.add(sixthBoxChoc);
    }

    // Add getter and setter
    public ArrayList<CandyBox> getCandies() {
        return candies;
    }

    public void setCandies(ArrayList<CandyBox> candies) {
        this.candies = candies;
    }
}
