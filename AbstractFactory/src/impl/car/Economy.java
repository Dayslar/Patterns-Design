package impl.car;

/**
 * Экономный наследуется от @class Geep,
 * переропределяет @method drive наследованного @interface Car,
 * так же добавляет новый @method superDrive()
 */
public class Economy extends Geep {

    public void drive(){
        System.out.println("Driver speed 20 km/h"); //печатаем скорость движения автомобиля
    }

    public void superDrive(){
        System.out.println("Driver speed 40 km/h. Oh my GOD, fuel consumption more than usual"); //печатаем скорость движения автомобиля
    }

}
