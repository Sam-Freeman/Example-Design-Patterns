/**
 * Concrete state implementation.
 * Used by the context when the current state of the meal is napping.
 * @author Samuel Freeman
 */
public class NapState implements MealState {
    
    /**
     * Determines what happens when asleep.
     */
    public void action() {
        System.out.println("zzzzZZZZZzzzz");
    }

    /**
     * Selects next state to be preparing and updates the current state of the context.
     */
    public void next(MealContext meal) {
        meal.setState(new PreparingState()); 
        System.out.println("You are now going to prepare the meal");
    }
}
