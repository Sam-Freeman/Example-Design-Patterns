/**
 * Class used to create a shape based on the data passed to it.
 * "Factory" used to create "Products"
 * @author Samuel Freeman
 */
public class ShapeFactory {
    /**
     * Use shape data to select which shape to create.
     */
    public static Shape createShape(ShapeData shapeData) {
        switch(shapeData.getDataType()) {
            case "rectangle":
                return new Rectangle(shapeData.getDataDimensions());
            case "circle":
                return new Circle(shapeData.getDataDimensions());
            case "triangle":
                return new Triangle(shapeData.getDataDimensions());
            default:
                throw new IllegalArgumentException("Bad Shape");
        }
    }
}
