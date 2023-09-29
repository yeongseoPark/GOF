package FactoryMethod;

public class WhiteShipFactory implements ShipFactory {


    @Override
    public Ship createShip() {

        return new WhiteShip();
    }
}
