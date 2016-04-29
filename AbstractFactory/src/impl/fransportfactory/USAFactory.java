package impl.fransportfactory;

import enums.RoadType;
import impl.aircraft.Boeing;
import impl.car.Porshe;
import interfaces.aircraft.AirCraft;
import interfaces.car.Car;
import interfaces.transportfactory.TransportFactory;

public class USAFactory implements TransportFactory {

    private static TransportFactory instance;

    private USAFactory(){
        super();
    }

    @Override
    public Car createCar(RoadType roadType) {
        return new Porshe();
    }

    public static synchronized TransportFactory getInstance() {
        if (instance == null)
            instance = new USAFactory();

        System.out.println(instance);

        return instance;
    }

    @Override
    public AirCraft createAircraft() {
        return new Boeing();
    }

}
