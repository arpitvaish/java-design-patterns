/**
 * DOUBLE-CHECKED LOCKING (DCL) — the classic production-grade singleton.
 * Locks only on the very first creation, then runs lock-free forever.
 * `volatile` is REQUIRED so half-constructed objects are never visible.
 */
public class DoubleCheckedSingleton {

    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
        System.out.println("DoubleCheckedSingleton created");
    }

    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {                       // 1st check: no lock, fast path
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {               // 2nd check: inside the lock
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
