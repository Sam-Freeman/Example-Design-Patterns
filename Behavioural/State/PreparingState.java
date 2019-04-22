/**
 * Concrete state implementation.
 * Used by the context when the current state of the meal is preparing.
 * @author Samuel Freeman
 */
public class PreparingState implements MealState {

    /**
     * Determines what happens when preparing the meal.
     */
    public void action() {
        System.out.println("Chop chop chop");
    }

    /**
     * Selects the next state to be cooking and updates the state of the context.
     */
    public void next(MealContext meal) {
        meal.setState(new CookingState());
        System.out.println("You are now cooking");
    } 
    
}
