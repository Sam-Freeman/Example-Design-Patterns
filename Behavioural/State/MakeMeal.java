import java.util.*;

/**
 * Class used to demonstrate the use of the state pattern to go through an entire meal.
 * @author Samuel Freeman
 */
public class MakeMeal {
    // Declare scanner to be used to prevent auto progression.
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        // Initialise the context of the meal (begins the process of a meal creation)
        MealContext meal = new MealContext();
        // Cycle through all states once on enter key press.
        do {
            meal.action();
            waitForInput();
            meal.nextState();
        } while(!(meal.getState() instanceof NapState));
    }
    
    /**
     * Used to wait for progression.
     * User must hit enter key.
     */
    private static void waitForInput() {
        String hold = scanner.nextLine();
    }

}
  
