package task2;

import task1.CandyBox;

public class Baravelli extends CandyBox {
    // TODO[0]: Add fields
    private float radius;
    private float height;

    // TODO[1]: Constructor without parameters
    public Baravelli () {
        super();
        radius = 0;
        height = 0;
    }

    // TODO[2]: Constructor which initialize all fields  (using super keyword)
    public Baravelli (String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    // TODO[3]: Override getVolume() method
    float getVolume() {
        return (float) (Math.PI * radius * radius * height);
    }

    // TODO[4]: Override toString() method - "Baravelli: The [origin] [flavor] has volume [volume]"
    @Override
    public String toString() {

        return "Baravelli: The " + getOrigin() + " " + getFlavor() + " chocolate has volume " + getVolume();
    }

    // TODO[0]: Add getters and setters

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Task 5
    public void printBaravelliDim() {
        System.out.println("Baravelli: " + radius + " " + height);
    }

    // Task 6
    public void printDim() {
        System.out.println("Baravelli: " + radius + " " + height);
    }
}
