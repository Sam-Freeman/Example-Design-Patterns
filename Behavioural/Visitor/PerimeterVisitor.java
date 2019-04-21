/**
 * A concrete implementation of the visitor that calculates the perimeter of a given shape.
 * Includes a visit method for each type of shape.
 * @author Samuel Freeman
 */
public class PerimeterVisitor implements Visitor {
        
    private double perimeter = 0;

    public PerimeterVisitor() {}

    /**
     * Visit method for a circle shape.
     * Uses circle perimeter formula : 2 * PI * radius
     */
    public void visit(Circle c) {
        perimeter = 2 * Math.PI * c.getRadius();
    }

    /**
     * Visit method for a triangle shape.
     * Uses triangle perimeter formula : sum of all sides.
     */
    public void visit(Triangle t) {
        // Reset perimeter to 0 incase another perimeter calculated first
        for (double side : t.getSideLengths()) {
            perimeter += side;
        }
    }

    /**
     * Visit method for a rectangle shape.
     * Uses rectangle perimeter formula : sum of all sides.
     */
    public void visit(Rectangle r) {
        perimeter = (2 * r.getHeight()) + (2 * r.getWidth()); 
    }

    /**
     * Return the perimeter of the last calculated shape.
     */
    public double getPerimeter() {
        return this.perimeter;
    }

}
