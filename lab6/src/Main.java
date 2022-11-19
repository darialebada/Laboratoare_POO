import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random rand = new Random(20);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskNum = scanner.nextInt();

        switch(taskNum) {
            case 1:
                Car mercedes = new Car(20000, Car.CarType.MERCEDES, 2019);
                Car fiat = new Car(7000, Car.CarType.FIAT, 2020);
                Car skoda = new Car(12000, Car.CarType.SKODA, 2022);
                Dealership dealership = new Dealership();
                break;
            case 2:
                dealership = new Dealership();

                Car mercedes1 = new Car(20000, Car.CarType.MERCEDES, 2010);
                dealership.getFinalPrice(mercedes1);
                Car mercedes2 = new Car(35000, Car.CarType.MERCEDES, 2015);
                dealership.getFinalPrice(mercedes2);

                Car fiat1 = new Car(3500, Car.CarType.FIAT, 2008);
                dealership.getFinalPrice(fiat1);
                Car fiat2 = new Car(7000, Car.CarType.FIAT, 2010);
                dealership.getFinalPrice(fiat2);

                Car skoda1 = new Car(12000, Car.CarType.SKODA, 2015);
                dealership.getFinalPrice(skoda1);
                Car skoda2 = new Car(25000, Car.CarType.SKODA, 2021);
                dealership.getFinalPrice(skoda2);

                break;
            case 3:
                dealership = new Dealership();

                Car car = new Car(20000, Car.CarType.MERCEDES, 2019);
                dealership.negociate(car, new Offer() {
                    @Override
                    public int getDiscount(Car car) {
                        return car.getPrice() * 5 / 100;
                    }
                });

                break;
            case 4:
                ArrayList<Car> cars = new ArrayList<>();
                cars.add(new Car(30000, Car.CarType.MERCEDES, 2019));
                cars.add(new Car(50000, Car.CarType.MERCEDES, 2021));
                cars.add(new Car(10000, Car.CarType.FIAT, 2018));
                cars.add(new Car(20000, Car.CarType.SKODA, 2019));

                cars.forEach(System.out::println);
                cars.removeIf((c) -> c.getPrice() > 2500);
                cars.forEach(System.out::println);

                break;
        }
    }
}