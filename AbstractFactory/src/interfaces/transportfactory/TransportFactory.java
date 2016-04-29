package interfaces.transportfactory;

import enums.RoadType;
import interfaces.aircraft.AirCraft;
import interfaces.car.Car;

//Фабрика по созданию транспортных средств
public interface TransportFactory{

    //Создание автомобилей
    Car createCar(RoadType roadType);

    //Создание самолетов
    AirCraft createAircraft();
}
