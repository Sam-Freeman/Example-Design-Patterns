/**
 * The simulated client using the visitors and shapes to calculate variious information.
 * In this case they are used to calculate the area and perimeter
 * @author Samuel Freeman
 */ 
public class Client {

    public static void main(String[] args) {
        // Create the shapes
        Shape c = new Circle(12);

        Shape r = new Rectangle(15, 22);

        // Note that the height/base of the triangle are not consistent with the side lengths.
        double[] triangleSides = {12, 25, 52};
        Shape t = new Triangle(triangleSides, 15, 24);

        // Initialise the visitors
        AreaVisitor areaVisitor = new AreaVisitor();
        PerimeterVisitor perimeterVisitor = new PerimeterVisitor();

        // Calculate and print the outputs
        // The elements (shapes) accept the visitors 
        c.accept(areaVisitor);
        System.out.println("Circle area: " + areaVisitor.getArea());

        t.accept(perimeterVisitor);
        System.out.println("Triangle perimeter: " + perimeterVisitor.getPerimeter());

        r.accept(areaVisitor);
        System.out.println("Rectangle area: " + areaVisitor.getArea());

    }

}
