package test.facade;

import test.parts.Door;
import test.parts.Wheel;
import test.parts.Zazhiganie;

public class CarFacade {

    private Door door = new Door();
    private Wheel wheel = new Wheel();
    private Zazhiganie zazhiganie = new Zazhiganie();


    public void go(){
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
}
