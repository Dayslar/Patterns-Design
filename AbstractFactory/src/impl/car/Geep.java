package impl.car;

import interfaces.car.Car;

public class Geep implements Car {

    @Override
    public void drive() {
        System.out.println("Driver speed 50 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 5 sec");
    }
}
