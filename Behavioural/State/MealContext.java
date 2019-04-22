/**
 * The context that defines a meal. 
 * Maintains the state of the meal, and determines which methods to call -
 * the current states.
 * @author Samuel Freeman
 */
public class MealContext {
    // Used to maintain state
    private MealState currentState;

    public MealContext() {
        // Set default value to nap.
        currentState = new NapState();
    }
    
    /**
     * Used by states to move to next state.
     * Updates the maintained state.
     */
    public void setState(MealState state) {
        this.currentState = state;
    }

    /**
     * Calls the appropriate state to move forward.
     * Provides itself so that {@link #setState(MealState) setState} can be accessed.
     */
    public void nextState() {
        currentState.next(this);
    }

    public MealState getState() {
        return currentState;
    }

    /**
     * Calls the appropriate states action method.
     */
    public void action() {
        currentState.action();
    }
}
