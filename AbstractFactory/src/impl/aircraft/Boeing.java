package impl.aircraft;

import interfaces.aircraft.AirCraft;

public class Boeing implements AirCraft {

    @Override
    public void flight() {
        System.out.println("Boeing took off");
    }
}
