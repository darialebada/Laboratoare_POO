package task3;

public class Polygon {
    int n;
    Point[] points;

    // TODO: Add constructors.
    public Polygon(int N) {
        points = new Point[N];
    }

    public Polygon(float[] p) {
        n = 0;
        points = new Point[p.length / 2];
        for(int i = 0; i < p.length; i+=2) {
            points[n++] = new Point(p[i], p[i + 1]);
        }
    }

    // TODO: Add showPolygon.
    void showPolygon() {
        for(int i = 0; i < n; i++) {
            points[i].showPoint();
        }
    }
}
