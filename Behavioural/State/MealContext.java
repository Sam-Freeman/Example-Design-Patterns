public class MealContext {
    private MealState currentState;

    public MealContext() {
        currentState = new NapState();
    }
    
    public void setState(MealState state) {
        this.currentState = state;
    }

    public void nextState() {
        currentState.next(this);
    }

    public MealState getState() {
        return currentState;
    }

    public void action() {
        currentState.action();
    }
}
