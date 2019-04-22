/**
 * Base state class to be used by other states.
 * Determines the current place of the meal.
 * The methods in this interface are called for the current state by the context.
 * @author Samuel Freeman
 */
public interface MealState {
    /**
     * The state specific events. 
     */
    public void action();

    /**
     * Determines the following state, and updates the state of the meal.
     */
    public void next(MealContext meal);
}
