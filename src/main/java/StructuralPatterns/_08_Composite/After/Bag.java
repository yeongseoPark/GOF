package StructuralPatterns._08_Composite.After;

import StructuralPatterns._08_Composite.Before.Item;

import java.util.ArrayList;
import java.util.List;

/* Composite 객체 */
public class Bag implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}

