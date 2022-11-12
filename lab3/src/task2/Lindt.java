package task2;

import task1.CandyBox;

public class Lindt extends CandyBox {
    // TODO[0]: Add fields
    private float length;
    private float width;
    private float height;

    // TODO[1]: Constructor without parameters
    public Lindt () {
        length = 0;
        width = 0;
        height = 0;
    }

    // TODO[2]: Constructor which initialize all fields (using super keyword)
    public Lindt (String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Lindt(float length, float width, float height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // TODO[3]: Override getVolume() method
    float getVolume() {

        return length * width * height;
    }

    // TODO[4]: Override toString() method - "Lindt: The [origin] [flavor] has volume [volume]"

    @Override
    public String toString() {

        return "Lindt: The " + getOrigin() + " " + getFlavor() + " chocolate has volume " + getVolume();
    }

    // TODO[0]: Add getters and setters

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Task5
    public void printLindtDim() {
        System.out.println("Lindt: " + length + " " + width + " " + height);
    }

    // Task 6
    public void printDim() {
        System.out.println("Lindt: " + length + " " + width + " " + height);
    }
}
