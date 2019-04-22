public class NapState implements MealState {

    public void action() {
        System.out.println("zzzzZZZZZzzzz");
    }

    public void next(MealContext meal) {
        meal.setState(new PreparingState()); 
        System.out.println("You are now going to prepare the meal");
    }
}
