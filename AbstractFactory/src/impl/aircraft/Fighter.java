package impl.aircraft;

import interfaces.aircraft.AirCraft;

public class Fighter implements AirCraft {

    @Override
    public void flight() {
        System.out.println("Fighter took off");
    }
}
