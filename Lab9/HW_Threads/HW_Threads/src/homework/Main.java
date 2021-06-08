package homework;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Intersection intersection = new Intersection();
        intersection.start();
        int numberOfCars = 10;
        for(int i = 0; i < numberOfCars; i++) {
            int id = random.nextInt();
            Car car = new Car(id, intersection);
            car.start();
            // Random wait between cars going to the intersection (up to 5 seconds)
            try {
                Thread.sleep(random.nextInt(5_000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
