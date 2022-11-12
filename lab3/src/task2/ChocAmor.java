package task2;

import task1.CandyBox;

public class ChocAmor extends CandyBox {
    // TODO[0]: Add fields
    private float length;

    // TODO[1]: Constructor without parameters
    public ChocAmor () {
        super();
        length = 0;
    }

    // TODO[2]: Constructor which initialize all fields  (using super keyword)
    public ChocAmor (String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    // TODO[3]: Override getVolume() method
    float getVolume() {
        return length * length * length;
    }

    // TODO[4]: Override toString() method - "ChocAmor: The [origin] [flavor] has volume [volume]"
    @Override
    public String toString() {

        return "ChocAmor: The " + this.getOrigin() + " " + this.getFlavor() + " chocolate has volume " + getVolume();
    }

    // TODO[0]: Add getters and setters

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    // Task 5
    public void printChocAmorDim() {
        System.out.println("ChocAmor: " + length);
    }
    // Task 6
    public void printDim() {
        System.out.println("ChocAmor: " + length);
    }
}
