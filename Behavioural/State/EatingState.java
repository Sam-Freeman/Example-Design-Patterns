/**
 * Concrete state implementation.
 * Used by the context when the current state of the meal is eating.
 * @author Samuel Freeman
 */
public class EatingState implements MealState {

    /**
     * Determines what happens when eating.
     */
    public void action() {
        System.out.println("Wow, this food tastes good.");
    }

    /**
     * Selects the next state to be cleaning and updates the state of the context.
     */
    public void next(MealContext meal) {
        meal.setState(new CleaningState());
        System.out.println("You are now tidying up");
    }
}
