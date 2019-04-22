public class EatingState implements MealState {

    public void action() {
        System.out.println("Wow, this food tastes good.");
    }

    public void next(MealContext meal) {
        meal.setState(new CleaningState());
        System.out.println("You are now tidying up");
    }
}
