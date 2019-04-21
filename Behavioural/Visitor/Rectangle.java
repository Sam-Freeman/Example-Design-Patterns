/**
 * A Rectangle shape - a concrete "Element" implementation.
 * Maintains information about a rectangle that can be used by visitors
 * to do various calculations.
 * @author Samuel Freeman
 */
public class Rectangle implements Shape {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
