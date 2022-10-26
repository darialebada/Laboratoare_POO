package task3;

public class Point {
    float x;
    float y;

    // TODO: Add constructor.
    public Point(float xx, float yy) {
        this.x = xx;
        this.y = yy;
    }

    // TODO: Add changeCoords.
    void changeCoords(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // TODO: Add showPoint.
    void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }

}
