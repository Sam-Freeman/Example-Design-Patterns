public class CleaningState implements MealState {

    public void action() {
        System.out.println("Slippery when wet, be careful");
    }

    public void next(MealContext meal) {
        meal.setState(new NapState());
        System.out.println("You are sleeping");
    }
}
