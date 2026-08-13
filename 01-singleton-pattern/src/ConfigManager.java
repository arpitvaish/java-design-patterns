import java.util.HashMap;
import java.util.Map;

/**
 * REAL-WORLD SCENARIO — a thread-safe configuration manager that loads
 * config once (an expensive operation) and serves it to the whole app.
 * Uses the Bill Pugh idiom: lazy + thread-safe + zero boilerplate.
 */
public class ConfigManager {

    private final Map<String, String> config = new HashMap<>();

    private ConfigManager() {
        loadConfigFromFile();  // pretend this reads a real file — expensive
    }

    private static class Holder {
        private static final ConfigManager INSTANCE = new ConfigManager();
    }

    public static ConfigManager getInstance() {
        return Holder.INSTANCE;
    }

    public String get(String key) {
        return config.get(key);
    }

    private void loadConfigFromFile() {
        System.out.println("Loading config from file (happens once)...");
        config.put("app.name", "PatternsDemo");
        config.put("app.env", "production");
        config.put("db.maxPoolSize", "20");
    }
}
