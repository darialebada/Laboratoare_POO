package Task1;

public class CounterOutTask implements Task {
    static int counter;

    public CounterOutTask () {
    }
    @Override
    public void execute() {
        counter++;
        System.out.println(counter);
    }
}
