package test;

import test.enums.RoadType;
import test.impl.NewGeep;
import test.interfaces.Car;
import test.utils.CarSelector;

public class Main {

    public static void main(String[] args) {

        Car car = CarSelector.getInstance().getCar(RoadType.CITY);
        car.drive();

        car = CarSelector.getInstance().getCar(RoadType.OFF_ROAD);
        car.drive();

        car = CarSelector.getInstance().getCar(RoadType.GAZON);

        if (car instanceof NewGeep){
            ((NewGeep) car).newFunction();
        }
    }

}
