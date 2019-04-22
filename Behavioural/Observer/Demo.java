public class Demo {
    public static void main(String[] args) {
        
        ObservableItem item = new ObservableItem();
        PersonA a = new PersonA(item);
        PersonB b = new PersonB(item);

        item.attach(a);
        item.attach(b);
        item.setAvailable(true);

    }
}
