import java.util.Random;

public class Dealership {
    class BrandOffer implements Offer {
        public int getDiscount(Car car) {
            switch (car.getType()) {
                case MERCEDES:
                    return car.getPrice() * 5 / 100;
                case FIAT:
                    return car.getPrice() * 10 / 100;
                case SKODA:
                    return car.getPrice() * 15 / 100;
                default:
                    return 0;
            }
        }
    }

    class DealerOffer implements Offer {
        public int getDiscount(Car car) {
            switch (car.getType()) {
                case MERCEDES:
                    return 300 * (2022 - car.getYear());
                case FIAT:
                    return 100 * (2022 - car.getYear());
                case SKODA:
                    return 150 * (2022 - car.getYear());
                default:
                    return 0;
            }
        }
    }

    class SpecialOffer implements Offer {
        private static Random rand = new Random(20);
        int random = rand.nextInt(1000);

        public int getDiscount(Car car) {
            return random;
        }
    }

    public int getFinalPrice (Car car) {
        BrandOffer brandOffer = new BrandOffer();
        DealerOffer dealerOffer = new DealerOffer();
        SpecialOffer specialOffer = new SpecialOffer();
        System.out.println("Applying Brand discount: " + brandOffer.getDiscount(car) + " euros");
        System.out.println("Applying Dealer discount: " + dealerOffer.getDiscount(car) + " euros");
        System.out.println("Applying Special discount: " + specialOffer.getDiscount(car) + " euros");

        return car.getPrice() - brandOffer.getDiscount(car) - dealerOffer.getDiscount(car) - specialOffer.getDiscount(car);
   }

   public void negociate(Car car, Offer offer) {
       System.out.println("Applying Client discount: " + offer.getDiscount(car) + " euros");
   }

}