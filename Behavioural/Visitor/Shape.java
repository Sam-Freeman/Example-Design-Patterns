/**
 * A Shape - "Element" base class that can be visited by visitors.
 * @author Samuel Freeman
 */
public interface Shape {
    /**
     * @param v receives data from this shape in its visit method.
     */
    public void accept(Visitor v);
}
