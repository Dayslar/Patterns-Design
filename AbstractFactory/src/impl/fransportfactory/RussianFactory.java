package impl.fransportfactory;

import enums.RoadType;
import impl.aircraft.Fighter;
import impl.car.Economy;
import impl.car.Geep;
import interfaces.aircraft.AirCraft;
import interfaces.car.Car;
import interfaces.transportfactory.TransportFactory;

/**
 * Русская транспортная фабрика, реализует @interface TransportFactory
 * RussianFactory реализуется @pattern SINGLETON,
 * получить экземплар фабрики можно только через @method getInstance()
 * Фабрика умеет создовать автомобили в зависимости от типа и самолеты @class Fighter
 */
public class RussianFactory implements TransportFactory{

    private static TransportFactory instance;
    public static synchronized TransportFactory getInstance() {
        if (instance == null)
            instance = new RussianFactory();
        return instance;
    }

    private RussianFactory() {

    }

    @Override
    public Car createCar(RoadType roadType) {
        switch (roadType){
            case CITY:
                return new Economy();
            default:
                return new Geep();
        }
    }

    @Override
    public AirCraft createAircraft() {
        return new Fighter();
    }
}
