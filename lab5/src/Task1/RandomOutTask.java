package Task1;

import java.util.Random;

public class RandomOutTask implements Task {
    static Random rand = new Random(12345);
    int rand_int;

    public RandomOutTask () {
        rand_int = rand.nextInt();
    }

    @Override
    public void execute() {
        System.out.println(rand_int);
    }
}
