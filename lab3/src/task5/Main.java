package task5;

import task1.CandyBox;
import task2.Baravelli;
import task2.ChocAmor;
import task2.Lindt;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flavor = scanner.next();
        String origin = scanner.next();
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float height = scanner.nextFloat();
        float radius = scanner.nextFloat();

        // TODO: Uncomment the code after implementing the task.

        CandyBox lindtBox = new Lindt(flavor, origin, length, width, height);
        CandyBox baravelliBox = new Baravelli(flavor, origin, radius, height);
        CandyBox chocAmorBox = new ChocAmor(flavor, origin, length);

        lindtBox.printLindtDim();
        baravelliBox.printBaravelliDim();
        chocAmorBox.printChocAmorDim();
    }
}
