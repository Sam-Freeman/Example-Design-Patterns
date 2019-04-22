import java.util.*;

public class MakeMeal {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        MealContext meal = new MealContext();
        do {
            meal.action();
            waitForInput();
            meal.nextState();
        } while(!(meal.getState() instanceof NapState));
    }
    
    private static void waitForInput() {
        String hold = scanner.nextLine();
    }

}
  
