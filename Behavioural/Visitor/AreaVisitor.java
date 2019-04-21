/**
 * A concrete implementation of the visitor that calculates the area of a given shape.
 * Includes a visit method for each type of shape.
 * @author Samuel Freeman
 */
public class AreaVisitor implements Visitor {

    // Set default area to 0
    private double area = 0;

    public AreaVisitor() {}

    /**
     * Visit method for a circle shape.
     * Uses the circle area formula : PI * radius^2
     */
    public void visit(Circle c) {
        area = Math.PI * c.getRadius() * c.getRadius();    
    }

    /**
     * Visit method for a triangle shape.
     * Uses the triangle area formula : 1/2 (width * height)
     */
    public void visit(Triangle t) {
        area = (0.5) * t.getHeight() * t.getBase(); 
    }

    /**
     * Visit method got a rectangle shape.
     * Uses the rectangle area forumla : width * height
     */
    public void visit(Rectangle r) {
        area = r.getHeight() * r.getWidth();
    }

    /**
     * Return the area of the last calculated shape.
     */
    public double getArea() {
        return area;
    }

}
