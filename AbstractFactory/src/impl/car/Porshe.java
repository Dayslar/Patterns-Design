package impl.car;

import interfaces.car.Car;
/**
 * Porshe - реализация интерфейса Car
 */
public class Porshe implements Car {

    @Override
    public void drive() {
        System.out.println("Drive speed 120 km/h"); // печатаем скорочть движения
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 3 sec"); //печатаем время необходимое для полной остановки автомобиля
    }
}
