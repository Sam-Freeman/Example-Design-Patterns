/**
 * Example use of a simple Singleton pattern.
 * @author Samuel Freeman
 */
public class Singleton {
    // Only one instance of the object can exist.
    private static Singleton instance = null;
    // Private constructor to prevent external classes calling
    private Singleton() {
        // Initialisation set up 
    }

    /**
     * Provides an instance of the object to be used. 
     * @return Singleton - the existing instance of the object, 
     * or creates the instance if one did not previously exist.
     */
    public static Singleton getInstance() {
        // Check if there is an existence of the object
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
