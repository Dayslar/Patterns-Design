package interfaces.transportfactory;

import enums.RoadType;
import interfaces.aircraft.AirCraft;
import interfaces.car.Car;

/**
 * Фабрика по созданию транспортных средств
 */
public interface TransportFactory{

    /**
     * Метод для создания автомобилей, возвращает автомобиль указанного типа,
     * @param roadType - тип необходимого автомобиля
     * @return Car
     */
    Car createCar(RoadType roadType);

    /**
     * Метод для создания самолетов, возвращает самолет указанного типа,
     * @return AirCraft
     */
    AirCraft createAircraft();
}
