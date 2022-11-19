public class Car {
    public enum CarType {
        MERCEDES,
        FIAT,
        SKODA
    }
    private int price;
    private int year;
    private CarType type;

    public Car(int price, CarType type, int year) {
        this.price = price;
        this.type = type;
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", carType=" + type +
                ", year=" + year +
                "}";
    }
}
