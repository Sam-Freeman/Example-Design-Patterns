public class PersonB implements Observer {
    private ObservableItem observable = null;
    public PersonB(ObservableItem observable) {
        // Set the subject to access state
        this.observable = observable;
    }

    public void update() {
        // What to do when the state of the subject changes
        // Check what the state changed to and update accordingly.
        if (observable.isAvailable()) {
            System.out.println("PersonB: It is now mine");
            observable.setAvailable(false);
        } else {
            System.out.println("PersonB: Aww, it's not available");
        }
    }

}
