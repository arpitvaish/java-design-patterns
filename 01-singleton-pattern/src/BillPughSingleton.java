/**
 * BILL PUGH SINGLETON — the cleanest thread-safe, lazy singleton in Java.
 * The inner holder class is not loaded until getInstance() is first called,
 * and the JVM guarantees class-loading is thread-safe. No synchronized,
 * no volatile, no boilerplate.
 */
public class BillPughSingleton {

    private BillPughSingleton() {
        System.out.println("BillPughSingleton created");
    }

    // Loaded lazily, exactly once, the first time getInstance() runs.
    private static class Holder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return Holder.INSTANCE;
    }

    public void log(String msg) {
        System.out.println("[billpugh] " + msg);
    }
}
