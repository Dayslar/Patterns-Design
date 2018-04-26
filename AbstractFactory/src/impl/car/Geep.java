package impl.car;

import interfaces.car.Car;

/**
 * Джип - реализация интерфейса Car
 */
public class Geep implements Car {

    @Override
    public void drive() {
        System.out.println("Driver speed 50 km/h");
    } // печатаем скорочть движения

    @Override
    public void stop() {
        System.out.println("Stopped at 5 sec"); //печатаем время необходимое для полной остановки автомобиля
    }
}
