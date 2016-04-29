package test.objects;

import test.facade.CarFacade;

public class Client {

    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.go();
    }
}
