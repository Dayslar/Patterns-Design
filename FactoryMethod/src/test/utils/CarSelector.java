package test.utils;

import test.enums.RoadType;
import test.impl.Geep;
import test.impl.NewGeep;
import test.impl.Porshe;
import test.interfaces.Car;

public class CarSelector {

    private static CarSelector instance;

    private CarSelector(){

    }

    //фабричный метод который создает машину
    public Car getCar(RoadType roadType){
        Car car = null;

        switch (roadType){
            case CITY:
                car = new Porshe();
                break;

            case OFF_ROAD:
                car = new Geep();
                break;

            case GAZON:
                car = new NewGeep();
                break;
        }

        return car;
    }

    public static synchronized CarSelector getInstance(){
        if (instance == null)
            instance = new CarSelector();

        return instance;
    }
}
