/**
 * Class used to hold data about shape. 
 * @author Samuel Freeman
 */
public class ShapeData {
    private String data_type;
    private String data_dimensions;

    public ShapeData(String data_type, String data_dimensions) {
        this.data_type = data_type;
        this.data_dimensions = data_dimensions;
    }

    public String getDataType() {
        return this.data_type;
    }

    public String getDataDimensions() {
        return this.data_dimensions;
    }
}
