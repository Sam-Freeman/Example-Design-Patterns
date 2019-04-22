public class PreparingState implements MealState {

    public void action() {
        System.out.println("Chop chop chop");
    }

    public void next(MealContext meal) {
        meal.setState(new CookingState());
        System.out.println("You are now cooking");
    } 
    
}
