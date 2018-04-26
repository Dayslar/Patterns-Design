package impl.aircraft;

import interfaces.aircraft.AirCraft;

/**
 * Самолет Boeing реализует @interface AirCraft
 */
public class Boeing implements AirCraft {

    @Override
    public void flight() {
        System.out.println("Boeing took off"); // боинг взлетел
    }
}
