/**
 * Concrete state implementation. 
 * Used by the context when the current state of the meal is cooking.
 * @author Samuel Freeman
 */
public class CookingState implements MealState {
   
    /**
     * Determines what happens when cooking.
     */
    public void action() {
        System.out.println("Wow, do I love cooking");
    }
    
    /**
     * Selects the next state to be eating and updates the state of the context.
     */
    public void next(MealContext meal) {
        meal.setState(new EatingState());
        System.out.println("You are now eating your meal");
    }
}
