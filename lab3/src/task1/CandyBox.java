package task1;

import java.util.Objects;

public class CandyBox {
    // TODO[0]: Add fields
    private String flavor;
    private String origin;

    // TODO[1]: Constructor without parameters which initialize all the fields
    public CandyBox () {
        flavor = "sugar-free";
        origin = "Switzerland";
    }

    // TODO[2]: Constructor with parameters
    public CandyBox (String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    // TODO[3]: Add getVolume() method
    float getVolume() {
        return 0;
    }

    // TODO[4]: Generate toString() method - "The [origin] [flavor] chocolate"

    @Override
    public String toString() {
        return "The " + origin + " " + flavor + " chocolate";
    }

    // TODO[0]: Add getters and setters

    public String getFlavor() {

        return flavor;
    }

    public void setFlavor(String flavor) {

        this.flavor = flavor;
    }

    public String getOrigin() {

        return origin;
    }

    public void setOrigin(String origin) {

        this.origin = origin;
    }

    // task3 - equals()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(flavor, candyBox.flavor) && Objects.equals(origin, candyBox.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, origin);
    }

    // Task 5
    public void printLindtDim() {
    }

    public void printBaravelliDim() {
    }

    public void printChocAmorDim() {
    }

    public void printDim() {
    }
}
