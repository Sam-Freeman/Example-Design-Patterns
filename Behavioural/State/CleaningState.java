/**
 * Concrete state implementation.
 * Used by the context when the current state of the meal is cleaning.
 * @author Samuel Freeman
 */
public class CleaningState implements MealState {

    /**
     * Determines what happens when cleaning.
     */
    public void action() {
        System.out.println("Slippery when wet, be careful");
    }

    /**
     * Selects the next state to be napping and updates the state of the context.
     */
    public void next(MealContext meal) {
        meal.setState(new NapState());
        System.out.println("You are sleeping");
    }
}
