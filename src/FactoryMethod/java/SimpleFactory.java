package FactoryMethod.java;

import FactoryMethod.BlackShip;
import FactoryMethod.WhiteShip;

public class SimpleFactory {
    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        }
        else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
