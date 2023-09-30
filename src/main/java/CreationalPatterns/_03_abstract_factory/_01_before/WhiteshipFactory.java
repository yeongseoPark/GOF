package CreationalPatterns._03_abstract_factory._01_before;

import CreationalPatterns._02_factory_method._02_after.DefaultShipFactory;
import CreationalPatterns._02_factory_method._02_after.Ship;
import CreationalPatterns._02_factory_method._02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
