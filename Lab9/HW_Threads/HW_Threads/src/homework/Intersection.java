package homework;

import java.util.ArrayList;

public class Intersection extends Thread {

    private ArrayList<Car> cars = new ArrayList<Car>();
    private boolean isRedLight = true;

    @Override
    public void run() {
        printCurrentState();
        while(true) {
            try {
                Thread.sleep(2_500);
                isRedLight = !isRedLight;
                printCurrentState();
                if(!isRedLight && !cars.isEmpty()) {
                    Car car = cars.remove(0);
                    car.passThrough();
                    System.out.println("Number of cars in intersection: " + this.cars.size());

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private void printCurrentState() {
        if(isRedLight) {
            System.out.println("Light is Red");
        }
        else {
            System.out.println("Light is Green");
        }
    }

    public void addCar(Car car) {
        this.cars.add(car);
        System.out.println("Number of cars in intersection: " + this.cars.size());
    }
}
