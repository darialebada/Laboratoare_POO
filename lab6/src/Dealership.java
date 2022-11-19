public class Dealership {
    class BrandOffer implements Offer {
        public int getDiscount(Car car) {
            if (car.getType().equals("MERCEDES")) {
                return car.getPrice() * 5 / 100;
            } else if (car.getType().equals("FIAT")) {
                return car.getPrice() * 10 / 100;
            } else {
                return car.getPrice() * 15 / 100;
            }
        }
    }

    class DealerOffer implements Offer {
        public int getDiscount(Car car) {
            if (car.getType().equals("MERCEDES")) {
                return 300 * (2022 - car.getYear());
            } else if (car.getType().equals("FIAT")) {
                return 100 * (2022 - car.getYear());
            } else {
                return 150 * (2022 - car.getYear());
            }
        }
    }

    class SpecialOffer implements Offer {
        public int getDiscount(Car car) {
            return Main.rand.nextInt(1000);
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