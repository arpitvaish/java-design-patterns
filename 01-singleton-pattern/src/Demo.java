/**
 * Demo: proves each singleton hands back the SAME object every time,
 * and shows the config-manager scenario.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("=== Basic Singleton ===");
        BasicSingleton a = BasicSingleton.getInstance();
        BasicSingleton b = BasicSingleton.getInstance();
        a.log("hello");
        System.out.println("same instance? " + (a == b));   // true

        System.out.println("\n=== Bill Pugh Singleton ===");
        BillPughSingleton p1 = BillPughSingleton.getInstance();
        BillPughSingleton p2 = BillPughSingleton.getInstance();
        System.out.println("same instance? " + (p1 == p2)); // true

        System.out.println("\n=== Enum Singleton ===");
        EnumSingleton.INSTANCE.log("bulletproof");
        System.out.println("same instance? "
                + (EnumSingleton.INSTANCE == EnumSingleton.INSTANCE)); // true

        System.out.println("\n=== ConfigManager (real-world) ===");
        ConfigManager cfg = ConfigManager.getInstance();
        ConfigManager cfg2 = ConfigManager.getInstance();   // no second file load
        System.out.println("app.name = " + cfg.get("app.name"));
        System.out.println("db.maxPoolSize = " + cfg.get("db.maxPoolSize"));
        System.out.println("same instance? " + (cfg == cfg2)); // true
    }
}
