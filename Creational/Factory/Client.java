/**
 * Simulates the use of the Factory by a client.
 * @author Samuel Freeman
 */
public class Client {

    public static void main(String[] args) {

        // Declare variables
        Shape currentShape;
        ShapeData data;

        // Create simulated ('fake') data of a shape
        data = new ShapeData("triangle", "15,25");
        // Use the factory to create a shape based off of the data
        currentShape = ShapeFactory.createShape(data);

        // Calculate information based on the created shape.
        System.out.println("Height: " + currentShape.getHeight());
        System.out.println("Width: " + currentShape.getWidth());
        System.out.println("Area: " + currentShape.getArea());

    }
}
