public class PersonA implements Observer {
    private ObservableItem observable = null;
    public PersonA(ObservableItem observable) {
        // Set the subject to access state
        this.observable = observable;
    }

    public void update() {
        // What to do when the state of the subject changes
        // Check what the state changed to and update accordingly.
        if (observable.isAvailable()) {
            System.out.println("PersonA: It is now mine");
            observable.setAvailable(false);
        } else {
            System.out.println("PersonA: Aww, it's not available");
        }
    }

}
