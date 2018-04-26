package impl.aircraft;

import interfaces.aircraft.AirCraft;

/**
 * Истребитель реализует интерфейс AirCraft
 */
public class Fighter implements AirCraft {

    @Override
    public void flight() {
        System.out.println("Fighter took off"); //истребитель взлетел
    }
}
