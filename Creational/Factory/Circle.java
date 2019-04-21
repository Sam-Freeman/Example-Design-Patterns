/**
 * Circle - Concrete implementation of shape.
 * A "Concrete Product" to be created by the factory class.
 * @author Samuel Freeman
 */
public class Circle implements Shape {
    private double circumference = 0;
    private double radius = 0;
   
    /**
     * Constructor for the creation of a circle.
     * @param dimensions - A string value containing the radius of the circle.
     */
    public Circle(String dimensions) {
        this.radius = Double.parseDouble(dimensions);
        circumference = radius * 2;
    }

    public String getShapeType() {
        return "Circle";
    }

    public double getWidth() {
        return circumference;
    }
    
    public double getHeight() {
        return circumference;
    }
    
    /**
     * Method that determines the area of the circle.
     * Uses the circle area formula : PI * radius^2
     * @return a double that is the value of the calculated area
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
