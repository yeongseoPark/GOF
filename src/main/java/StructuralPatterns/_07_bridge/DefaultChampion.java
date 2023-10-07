package StructuralPatterns._07_bridge;

import java.nio.channels.Channel;

/* Implementation , 각 챔피언들이 Refined Abstraction */
public class DefaultChampion implements Champion {
    private Skin skin; // Implementation detail, 각 Skin들이 Concrete Implementation

    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move\n", skin.getName() , this.name);
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s Q\n", skin.getName() , this.name);
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s W\n", skin.getName() , this.name);
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s E\n", skin.getName() , this.name);
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s R\n", skin.getName() , this.name);
    }
}
