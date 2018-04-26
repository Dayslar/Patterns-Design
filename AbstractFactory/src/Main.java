import enums.RoadType;
import impl.fransportfactory.RussianFactory;
import impl.fransportfactory.USAFactory;
import interfaces.aircraft.AirCraft;
import interfaces.car.Car;
import interfaces.transportfactory.TransportFactory;

public class Main {

    public static void main(String[] args) {

        System.out.println("Русская фабрика");
        TransportFactory transportFactory = RussianFactory.getInstance(); //получаем экземпляр русской транспортной фабрику
        AirCraft airCraft = transportFactory.createAircraft(); //строим самолет
        airCraft.flight(); //взлетаем на самолете

        Car car = transportFactory.createCar(RoadType.OFF_ROAD); //строим автомобиль
        car.drive(); //едем на автомобиле

        System.out.println();
        System.out.println("Американская фабрика");
        transportFactory = USAFactory.getInstance(); //получаем экземпляр американской транспортной фабрику
        airCraft = transportFactory.createAircraft(); //строим самолет
        airCraft.flight(); //взлетаем на самолете

        car = transportFactory.createCar(RoadType.OFF_ROAD); //строим автомобиль
        car.drive(); //едем на автомобиле
    }

}
