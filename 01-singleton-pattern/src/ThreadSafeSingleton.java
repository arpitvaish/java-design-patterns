/**
 * THREAD-SAFE SINGLETON via a synchronized method.
 * Correct, but every call pays the locking cost — even after the
 * instance already exists. Fine for low-traffic singletons.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        System.out.println("ThreadSafeSingleton created");
    }

    // `synchronized` lets only ONE thread enter at a time
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
