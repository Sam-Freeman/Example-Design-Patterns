public class CookingState implements MealState {
   
    public void action() {
        System.out.println("Wow, do I love cooking");
    }
    
    public void next(MealContext meal) {
        meal.setState(new EatingState());
        System.out.println("You are now eating your meal");
    }
}
