package impl.fransportfactory;

import enums.RoadType;
import impl.aircraft.Fighter;
import impl.car.NewGeep;
import interfaces.aircraft.AirCraft;
import interfaces.car.Car;
import interfaces.transportfactory.TransportFactory;


public class RussianFactory implements TransportFactory{

    private static TransportFactory instance;

    private RussianFactory() {

    }

    public static synchronized TransportFactory getInstance() {
        if (instance == null)
            instance = new RussianFactory();

        System.out.println(instance);
        return instance;
    }

    @Override
    public Car createCar(RoadType roadType) {
        return new NewGeep();
    }

    @Override
    public AirCraft createAircraft() {
        return new Fighter();
    }
}
