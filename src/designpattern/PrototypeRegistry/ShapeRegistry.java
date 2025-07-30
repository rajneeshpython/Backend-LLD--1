package designpattern.PrototypeRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    private Map<String, Shape> shapePrototypes = new HashMap<>();

    public void register(String key, Shape shape) {
        shapePrototypes.put(key, shape);
    }

    public Shape get(String key) {
        Shape prototype =  shapePrototypes.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("Shape " + key + " does not exist");
        }
        return prototype;
    }
}
