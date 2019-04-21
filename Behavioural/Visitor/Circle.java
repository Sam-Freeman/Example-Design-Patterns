/**
 * Circle class - a concrete "Element" implementation.
 * Maintains information that can be used by the visitor to do various calculations.
 * @author Samuel Freeman
 */
public class Circle implements Shape {
    double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
