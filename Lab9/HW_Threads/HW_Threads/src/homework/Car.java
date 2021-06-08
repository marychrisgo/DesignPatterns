package homework;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Car extends Thread {
    private int id;
    private Intersection intersection;
    private CountDownLatch stopAtIntersection;

    public Car(int id, Intersection intersection) {
        this.id = id;
        this.intersection = intersection;
        this.stopAtIntersection = new CountDownLatch(1);
    }

    private void drive(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Car " + id + " stopping");
    }

    private void enterIntersection(Intersection intersection) {
        try {
            intersection.addCar(this);
            System.out.println("Car " + id + " waiting for turn to pass through");
            stopAtIntersection.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("Car " + id + " is approaching the intersection");
        drive(3_000);
        System.out.println("Car " + id + " arrived at the intersection");
        enterIntersection(this.intersection);
        drive(1_000);
        System.out.println("Car " + id + " exited the intersection");
        drive(3_000);
    }

    public void passThrough() {
        System.out.println("Car " + id + " passing through the intersection");
        this.stopAtIntersection.countDown();
    }

    @Override
    public String toString() {
        return "Car " + id;
    }
}
