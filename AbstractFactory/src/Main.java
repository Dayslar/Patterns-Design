import enums.RoadType;
import impl.fransportfactory.RussianFactory;
import impl.fransportfactory.USAFactory;
import interfaces.aircraft.AirCraft;
import interfaces.car.Car;
import interfaces.transportfactory.TransportFactory;

public class Main {

    public static void main(String[] args) {

        TransportFactory transportFactory = RussianFactory.getInstance();
        AirCraft airCraft = transportFactory.createAircraft();
        airCraft.flight();

        Car car = transportFactory.createCar(RoadType.OFF_ROAD);
        car.drive();


        transportFactory = USAFactory.getInstance();
        airCraft = transportFactory.createAircraft();
        airCraft.flight();

        car = transportFactory.createCar(RoadType.OFF_ROAD);
        car.drive();


        transportFactory = RussianFactory.getInstance();
        airCraft = transportFactory.createAircraft();
        airCraft.flight();

        car = transportFactory.createCar(RoadType.OFF_ROAD);
        car.drive();

    }

}
