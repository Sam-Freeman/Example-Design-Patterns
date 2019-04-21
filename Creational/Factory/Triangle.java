/**
 * Triangle - Concrete implementation of shape.
 * A "Concrete Product" to be created by the factory class
 * @author Samuel Freeman
 */
public class Triangle implements Shape {
    private double height, width;

    /**
     * Constructor for a triangle. 
     * @param dimensions - A string of the dimensions of the triangle.
     * In the format "height,width"
     */
    public Triangle(String dimensions) {
        this.height = Double.parseDouble(dimensions.split(",")[0]);
        this.width = Double.parseDouble(dimensions.split(",")[1]);
    }

    public String getShapeType() {
        return "Triangle";
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    /**
     * Calculates the area of the given triangle.
     * Uses the area formula for a triangle : (base * height) / 2
     * @return the double value of the area of the triangle
     */
    public double getArea() {
        return (this.width * this.height) / 2;
    }
}
