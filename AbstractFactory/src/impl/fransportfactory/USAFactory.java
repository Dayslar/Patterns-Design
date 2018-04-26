package impl.fransportfactory;

import enums.RoadType;
import impl.aircraft.Boeing;
import impl.car.Economy;
import impl.car.Porshe;
import interfaces.aircraft.AirCraft;
import interfaces.car.Car;
import interfaces.transportfactory.TransportFactory;

/**
 * Американская транспортная фабрика, реализует @interface TransportFactory
 * USAFactory реализуется @pattern SINGLETON,
 * получить экземплар фабрики можно только через @method getInstance()
 * Фабрика умеет создовать автомобили в зависимости от типа и сомолеты @class Boeing
 */
public class USAFactory implements TransportFactory {

    private static TransportFactory instance;
    public static synchronized TransportFactory getInstance() {
        if (instance == null)
            instance = new USAFactory();

        return instance;
    }

    private USAFactory(){ }

    @Override
    public Car createCar(RoadType roadType) {
        switch (roadType){
            case CITY:
                return new Economy();
            default:
                return new Porshe();
        }
    }

    @Override
    public AirCraft createAircraft() {
        return new Boeing();
    }

}
