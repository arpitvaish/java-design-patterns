/**
 * ENUM SINGLETON — Joshua Bloch's recommendation ("Effective Java").
 * Thread-safe by construction, and immune to serialization and
 * reflection attacks that can break the other approaches.
 *
 * Usage: EnumSingleton.INSTANCE.log("hi");
 */
public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
        System.out.println("EnumSingleton created");
    }

    public void log(String msg) {
        System.out.println("[enum] " + msg);
    }
}
