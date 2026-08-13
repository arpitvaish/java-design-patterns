/**
 * BASIC (LAZY) SINGLETON — simple, but NOT thread-safe.
 * Good for single-threaded code and for teaching the 3 core ingredients.
 */
public class BasicSingleton {

    // 1) private static reference to the one and only instance
    private static BasicSingleton instance;

    // 2) private constructor: nobody outside can do `new BasicSingleton()`
    private BasicSingleton() {
        System.out.println("BasicSingleton created");
    }

    // 3) the single public door to get the instance
    public static BasicSingleton getInstance() {
        if (instance == null) {          // first time only
            instance = new BasicSingleton();
        }
        return instance;                 // same object forever after
    }

    public void log(String msg) {
        System.out.println("[basic] " + msg);
    }
}
