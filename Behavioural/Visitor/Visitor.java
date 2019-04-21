/**
 * The visitor interface for visiting a shape.
 * Each type of shape must have its own visit method in any implementation.
 * @author Samuel Freeman
 */
public interface Visitor {
    public void visit(Circle c);
    public void visit(Triangle t);
    public void visit(Rectangle r);
}
