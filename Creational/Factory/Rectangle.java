/**
 * Rectangle - Concrete implementation of shape.
 * A "Concrete Product" to be created by the factory class
 * @author Samuel Freeman
 */
public class Rectangle implements Shape {
    private double height, width;
   
    /**
     * Constructor for a Rectangle.
     * @param dimensions - String value of the dimensions of the rectangle.
     * Formatted as "height,width"
     */
    public Rectangle(String dimensions) {
        this.height = Double.parseDouble(dimensions.split(",")[0]);
        this.width = Double.parseDouble(dimensions.split(",")[1]);
    }

    public String getShapeType() {
        return "Rectangle";
    }
    
    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    /**
     * Method that determines the area of the Square.
     * Uses the square area formula : width * height
     * @return a double that is the value of the calculated area
     */
    public double getArea() {
        return this.width * this.height;
    }
}
