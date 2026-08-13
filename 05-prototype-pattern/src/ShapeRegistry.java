import java.util.HashMap;
import java.util.Map;

/**
 * A prototype registry: preconfigured templates you clone on demand.
 * Callers never build a shape from scratch — they ask for a copy of a template.
 */
public class ShapeRegistry {
    private final Map<String, Shape> prototypes = new HashMap<>();

    public void register(String key, Shape prototype) {
        prototypes.put(key, prototype);
    }

    public Shape get(String key) {
        Shape prototype = prototypes.get(key);
        if (prototype == null) throw new IllegalArgumentException("No prototype: " + key);
        return prototype.cloneShape();   // hand back a fresh, independent copy
    }
}
